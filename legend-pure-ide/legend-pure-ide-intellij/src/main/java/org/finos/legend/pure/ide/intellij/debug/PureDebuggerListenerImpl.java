// Copyright 2024 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.pure.ide.intellij.debug;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.Project;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.breakpoints.XBreakpoint;
import com.intellij.xdebugger.breakpoints.XLineBreakpoint;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.stack.MutableStack;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function;
import org.finos.legend.pure.m3.exception.PureExecutionException;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.runtime.java.interpreted.PureDebuggerListener;
import org.finos.legend.pure.runtime.java.interpreted.VariableContext;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Concrete implementation of {@link PureDebuggerListener} that integrates
 * with IntelliJ's {@link XDebugSession}.
 * <p>
 * Handles:
 * <ul>
 *   <li><b>Breakpoint matching</b>: compares expression SourceInformation against registered breakpoints</li>
 *   <li><b>Line-level stop deduplication</b>: a single source line may produce multiple
 *       nested {@code onBeforeExpressionEvaluation} calls — we only suspend on the first one
 *       per line by tracking the last stopped {@code sourceId + line}</li>
 *   <li><b>Stepping</b>: implements step over / step into / step out by tracking call depth
 *       and current source line</li>
 * </ul>
 */
public class PureDebuggerListenerImpl implements PureDebuggerListener
{
    /**
     * Stepping mode for the debugger.
     */
    enum StepMode
    {
        /** Normal execution — only stop on breakpoints. */
        NONE,
        /** Step Over — stop when line changes at same or lower call depth. */
        STEP_OVER,
        /** Step Into — stop on next expression with different SourceInfo. */
        STEP_INTO,
        /** Step Out — stop when call depth drops below starting depth. */
        STEP_OUT
    }

    private final XDebugSession session;
    private final Project project;

    // Breakpoint registry: key = "sourceId:line" (1-indexed line number)
    private final Map<String, XLineBreakpoint<PureBreakpointProperties>> breakpoints = new ConcurrentHashMap<>();

    // Suspend mechanism
    private volatile CountDownLatch suspendLatch;
    private volatile boolean stopped = false;

    // Line-level deduplication: track last stopped position
    private volatile String lastStoppedSourceId;
    private volatile int lastStoppedLine = -1;

    // Stepping state
    private final AtomicReference<StepMode> stepMode = new AtomicReference<>(StepMode.NONE);
    private final AtomicInteger callDepth = new AtomicInteger(0);
    private volatile int stepStartDepth = 0;
    private volatile String stepStartSourceId;
    private volatile int stepStartLine = -1;

    // Captured context for suspend
    private volatile VariableContext capturedVariableContext;
    private volatile MutableStack<CoreInstance> capturedCallStack;

    public PureDebuggerListenerImpl(@NotNull XDebugSession session, @NotNull Project project)
    {
        this.session = session;
        this.project = project;
    }

    public void registerBreakpoint(XLineBreakpoint<PureBreakpointProperties> breakpoint)
    {
        String key = makeBreakpointKey(breakpoint.getSourcePosition().getFile().getPath(),
                breakpoint.getLine() + 1); // IntelliJ uses 0-indexed lines, Pure uses 1-indexed
        breakpoints.put(key, breakpoint);
    }

    public void unregisterBreakpoint(XLineBreakpoint<PureBreakpointProperties> breakpoint)
    {
        String key = makeBreakpointKey(breakpoint.getSourcePosition().getFile().getPath(), breakpoint.getLine());
        breakpoints.remove(key);
    }

    @Override
    public void onBeforeExpressionEvaluation(CoreInstance expression,
                                              SourceInformation sourceInfo,
                                              VariableContext variableContext,
                                              MutableStack<CoreInstance> callStack)
    {
        if (sourceInfo == null)
        {
            return;
        }

        String sourceId = Objects.equals(sourceInfo.getSourceId(), "welcome.pure") ? project.getBasePath() + "/welcome.pure" : sourceInfo.getSourceId();

        int line = sourceInfo.getLine();

        // Line-level deduplication: skip if we already stopped on this exact line
        if (sourceId.equals(lastStoppedSourceId) && line == lastStoppedLine)
        {
            return;
        }

        boolean shouldSuspend = false;

        // Check stepping mode first
        StepMode currentStepMode = stepMode.get();
        switch (currentStepMode)
        {
            case STEP_OVER:
                // Suspend when line changes AND call depth <= starting depth
                if (callDepth.get() <= stepStartDepth &&
                        (line != stepStartLine || !sourceId.equals(stepStartSourceId)))
                {
                    shouldSuspend = true;
                }
                break;

            case STEP_INTO:
                // Suspend on any expression with different SourceInfo
                if (line != stepStartLine || !sourceId.equals(stepStartSourceId))
                {
                    shouldSuspend = true;
                }
                break;

            case STEP_OUT:
                // Suspend when depth drops below starting depth
                if (callDepth.get() < stepStartDepth)
                {
                    shouldSuspend = true;
                }
                break;

            case NONE:
            default:
                // Check breakpoints
                String key = makeBreakpointKey(sourceId, line);
                if (breakpoints.containsKey(key))
                {
                    shouldSuspend = true;
                }
                break;
        }

        if (shouldSuspend)
        {
            suspend(sourceInfo, variableContext, callStack);
        }
    }

    @Override
    public void onAfterExpressionEvaluation(CoreInstance expression,
                                             CoreInstance result,
                                             SourceInformation sourceInfo)
    {
        // Currently used as a no-op hook point.
        // Future: could be used for "step over" to detect when the
        // current expression completes evaluation.
    }

    @Override
    public void onFunctionEnter(Function<?> function,
                                 ListIterable<? extends CoreInstance> params,
                                 SourceInformation callSiteInfo)
    {
        callDepth.incrementAndGet();
    }

    @Override
    public void onFunctionExit(Function<?> function, CoreInstance result)
    {
        callDepth.decrementAndGet();
    }

    @Override
    public void onException(PureExecutionException exception)
    {
        // TODO: Optionally suspend on exception (break-on-exception feature)
    }

    /**
     * Resume execution from suspend.
     */
    public void resume()
    {
        stepMode.set(StepMode.NONE);
        releaseSuspend();
    }

    /**
     * Step over the current line.
     */
    public void stepOver()
    {
        stepStartDepth = callDepth.get();
        stepStartSourceId = lastStoppedSourceId;
        stepStartLine = lastStoppedLine;
        stepMode.set(StepMode.STEP_OVER);
        releaseSuspend();
    }

    /**
     * Step into the current expression.
     */
    public void stepInto()
    {
        stepStartDepth = callDepth.get();
        stepStartSourceId = lastStoppedSourceId;
        stepStartLine = lastStoppedLine;
        stepMode.set(StepMode.STEP_INTO);
        releaseSuspend();
    }

    /**
     * Step out of the current function.
     */
    public void stepOut()
    {
        stepStartDepth = callDepth.get();
        stepMode.set(StepMode.STEP_OUT);
        releaseSuspend();
    }

    /**
     * Stop execution entirely.
     */
    public void stop()
    {
        stopped = true;
        releaseSuspend();
    }

    // --- Private helpers ---

    private void suspend(SourceInformation sourceInfo, VariableContext variableContext,
                         MutableStack<CoreInstance> callStack)
    {
        // Record where we stopped for deduplication
        lastStoppedSourceId = sourceInfo.getSourceId();
        lastStoppedLine = sourceInfo.getLine();

        // Reset step mode since we've reached a stop point
        stepMode.set(StepMode.NONE);

        // Capture context
        capturedVariableContext = variableContext;
        capturedCallStack = callStack;

        // Create suspend context and notify the debug session
        PureSuspendContext suspendContext = new PureSuspendContext(
                project, sourceInfo, variableContext, callStack);

        // Must notify on the application thread
        ApplicationManager.getApplication().invokeLater(() ->
                session.positionReached(suspendContext));

        // Block the execution thread until the user resumes/steps
        suspendLatch = new CountDownLatch(1);
        try
        {
            suspendLatch.await();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        if (stopped)
        {
            throw new RuntimeException("Debugger stopped by user");
        }
    }

    private void releaseSuspend()
    {
        CountDownLatch latch = suspendLatch;
        if (latch != null)
        {
            latch.countDown();
        }
    }

    private static String makeBreakpointKey(String sourceId, int line)
    {
        return sourceId + ":" + line;
    }

    // Annotation type to satisfy compilation — we use the Jetbrains @NotNull
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    private @interface NotNull {}
}

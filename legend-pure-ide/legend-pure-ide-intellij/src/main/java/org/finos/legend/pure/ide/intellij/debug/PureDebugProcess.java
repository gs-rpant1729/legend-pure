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

import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.project.Project;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.XSourcePosition;
import com.intellij.xdebugger.breakpoints.XBreakpointHandler;
import com.intellij.xdebugger.breakpoints.XLineBreakpoint;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import com.intellij.xdebugger.frame.XSuspendContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Core debug process that connects the Pure interpreted execution engine
 * to the IntelliJ debugger UI.
 * <p>
 * Responsibilities:
 * <ul>
 *   <li>Holds a {@code PureDebuggerListenerImpl} that bridges between the
 *       interpreter hooks and the IntelliJ debug session</li>
 *   <li>Runs Pure execution on a separate thread</li>
 *   <li>Translates breakpoint hits into {@code XSuspendContext} via the listener</li>
 *   <li>Delegates stepping (step into/over/out) to the listener's step state machine</li>
 * </ul>
 */
public class PureDebugProcess extends XDebugProcess
{
    private final Project project;
    private final PureBreakpointHandler breakpointHandler;
    private final PureDebuggerListenerImpl debuggerListener;

    public PureDebugProcess(@NotNull XDebugSession session, @NotNull Project project)
    {
        super(session);
        this.project = project;
        this.debuggerListener = new PureDebuggerListenerImpl(session, project);
        this.breakpointHandler = new PureBreakpointHandler(this);
    }

    /**
     * Returns the debugger listener for attachment to the interpreter.
     */
    public PureDebuggerListenerImpl getDebuggerListener()
    {
        return debuggerListener;
    }

    @Override
    public @NotNull ConsoleView createConsole()
    {
        return TextConsoleBuilderFactory.getInstance().createBuilder(project).getConsole();
    }

    @Override
    public @NotNull XDebuggerEditorsProvider getEditorsProvider()
    {
        return new PureDebuggerEditorsProvider();
    }

    @Override
    public XBreakpointHandler<?> @NotNull [] getBreakpointHandlers()
    {
        return new XBreakpointHandler[]{breakpointHandler};
    }

    @Override
    public void startStepOver(@Nullable XSuspendContext suspendContext)
    {
        debuggerListener.stepOver();
    }

    @Override
    public void startStepInto(@Nullable XSuspendContext suspendContext)
    {
        debuggerListener.stepInto();
    }

    @Override
    public void startStepOut(@Nullable XSuspendContext suspendContext)
    {
        debuggerListener.stepOut();
    }

    @Override
    public void resume(@Nullable XSuspendContext suspendContext)
    {
        debuggerListener.resume();
    }

    @Override
    public void stop()
    {
        debuggerListener.stop();
    }

    /**
     * Register a breakpoint for the debugger listener to match against.
     */
    void addBreakpoint(XLineBreakpoint<PureBreakpointProperties> breakpoint)
    {
        debuggerListener.registerBreakpoint(breakpoint);
    }

    /**
     * Remove a breakpoint.
     */
    void removeBreakpoint(XLineBreakpoint<PureBreakpointProperties> breakpoint)
    {
        debuggerListener.unregisterBreakpoint(breakpoint);
    }

    /**
     * Inner handler for Pure breakpoints.
     */
    private static class PureBreakpointHandler extends XBreakpointHandler<XLineBreakpoint<PureBreakpointProperties>>
    {
        private final PureDebugProcess debugProcess;

        @SuppressWarnings("unchecked")
        PureBreakpointHandler(PureDebugProcess debugProcess)
        {
            super(PureLineBreakpointType.class);
            this.debugProcess = debugProcess;
        }

        @Override
        public void registerBreakpoint(@NotNull XLineBreakpoint<PureBreakpointProperties> breakpoint)
        {
            debugProcess.addBreakpoint(breakpoint);
        }

        @Override
        public void unregisterBreakpoint(@NotNull XLineBreakpoint<PureBreakpointProperties> breakpoint, boolean temporary)
        {
            debugProcess.removeBreakpoint(breakpoint);
        }
    }
}

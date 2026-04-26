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

import com.intellij.openapi.project.Project;
import com.intellij.xdebugger.frame.XExecutionStack;
import com.intellij.xdebugger.frame.XStackFrame;
import com.intellij.xdebugger.frame.XSuspendContext;
import org.eclipse.collections.api.stack.MutableStack;
import org.finos.legend.pure.m3.navigation.PackageableElement.PackageableElement;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.runtime.java.interpreted.VariableContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Suspend context created when the debugger pauses execution at a breakpoint
 * or stepping point. Provides the execution stacks to the IntelliJ debugger UI.
 */
public class PureSuspendContext extends XSuspendContext
{
    private final PureExecutionStack executionStack;

    public PureSuspendContext(@NotNull Project project,
                              @NotNull SourceInformation currentSourceInfo,
                              @NotNull VariableContext currentVariableContext,
                              @NotNull MutableStack<CoreInstance> callStack)
    {
        this.executionStack = new PureExecutionStack(project, currentSourceInfo, currentVariableContext, callStack);
    }

    @Override
    public @NotNull XExecutionStack getActiveExecutionStack()
    {
        return executionStack;
    }

    @Override
    public XExecutionStack @NotNull [] getExecutionStacks()
    {
        return new XExecutionStack[]{executionStack};
    }

    /**
     * Execution stack for the Pure interpreter thread.
     */
    private static class PureExecutionStack extends XExecutionStack
    {
        private final Project project;
        private final SourceInformation currentSourceInfo;
        private final VariableContext currentVariableContext;
        private final MutableStack<CoreInstance> callStack;

        PureExecutionStack(@NotNull Project project,
                           @NotNull SourceInformation currentSourceInfo,
                           @NotNull VariableContext currentVariableContext,
                           @NotNull MutableStack<CoreInstance> callStack)
        {
            super("Pure Interpreter");
            this.project = project;
            this.currentSourceInfo = currentSourceInfo;
            this.currentVariableContext = currentVariableContext;
            this.callStack = callStack;
        }

        @Override
        public @Nullable XStackFrame getTopFrame()
        {
            return new PureStackFrame(
                    project,
                    getFrameName(callStack.isEmpty() ? null : callStack.peek()),
                    currentSourceInfo,
                    currentVariableContext
            );
        }

        @Override
        public void computeStackFrames(int firstFrameIndex, @NotNull XStackFrameContainer container)
        {
            List<XStackFrame> frames = new ArrayList<>();

            // Frame 0: the current position (where execution is paused).
            // This is the same frame returned by getTopFrame() and is the one
            // that has live variable bindings.
            if (firstFrameIndex == 0)
            {
                frames.add(new PureStackFrame(
                        project,
                        getFrameName(callStack.isEmpty() ? null : callStack.peek()),
                        currentSourceInfo,
                        currentVariableContext));
            }

            // Frames 1..N: callers from the call stack.
            // callStack.peekAt(0) = direct caller (frame 1),
            // callStack.peekAt(1) = its caller (frame 2), etc.
            int callerStart = Math.max(0, firstFrameIndex - 1);
            for (int i = callerStart; i < callStack.size(); i++)
            {
                CoreInstance callSite = callStack.peekAt(i);
                frames.add(new PureStackFrame(
                        project,
                        getFrameName(callSite),
                        callSite.getSourceInformation(),
                        null)); // variable context only available for the top frame
            }

            container.addStackFrames(frames, true);
        }

        private static String getFrameName(@Nullable CoreInstance callSite)
        {
            if (callSite == null)
            {
                return "<unknown>";
            }

            // Try to get a readable function name
            String name = callSite.getName();
            if (name != null && !name.isEmpty())
            {
                return name;
            }

            // Fallback to classifier name
            CoreInstance classifier = callSite.getClassifier();
            if (classifier != null)
            {
                return classifier.getName();
            }

            return "<expression>";
        }
    }
}

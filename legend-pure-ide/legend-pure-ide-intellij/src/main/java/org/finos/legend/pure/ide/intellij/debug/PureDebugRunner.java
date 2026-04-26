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

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.configurations.RunnerSettings;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugProcessStarter;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.XDebuggerManager;
import org.eclipse.collections.api.factory.Lists;
import org.finos.legend.pure.ide.intellij.run.PureRunConfiguration;
import org.finos.legend.pure.ide.intellij.service.PureProjectService;
import org.finos.legend.pure.m3.serialization.runtime.PureRuntime;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.runtime.java.interpreted.FunctionExecutionInterpreted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Debug runner for Pure programs. Creates a PureDebugProcess
 * that connects the IntelliJ debugger UI to the Pure interpreted execution engine.
 * <p>
 * When debug mode is active, the runner:
 * <ol>
 *   <li>Creates a {@link PureDebugProcess} with an attached {@link PureDebuggerListenerImpl}</li>
 *   <li>Attaches the listener to the {@link FunctionExecutionInterpreted} engine</li>
 *   <li>Runs the target Pure function on a separate thread with debugger support</li>
 * </ol>
 */
public class PureDebugRunner extends GenericProgramRunner<RunnerSettings>
{
    @Override
    public @NotNull String getRunnerId()
    {
        return "PureDebugRunner";
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile profile)
    {
        return executorId.equals("Debug") && profile instanceof PureRunConfiguration;
    }

    @Override
    protected @Nullable RunContentDescriptor doExecute(@NotNull RunProfileState state,
                                                        @NotNull ExecutionEnvironment environment) throws ExecutionException
    {
        PureRunConfiguration config = (PureRunConfiguration) environment.getRunProfile();
        String functionName = config.resolveEffectiveFunctionName();

        PureProjectService service = PureProjectService.getInstance(environment.getProject());
        PureRuntime runtime = service.getRuntime();
        if (runtime == null)
        {
            throw new ExecutionException("Pure runtime not initialized. Please wait for initialization to complete.");
        }

        CoreInstance function = runtime.getCoreInstance(functionName);
        if (function == null)
        {
            throw new ExecutionException("Function not found: " + functionName);
        }

        XDebugSession session = XDebuggerManager.getInstance(environment.getProject())
                .startSession(environment, new XDebugProcessStarter()
                {
                    @Override
                    public @NotNull XDebugProcess start(@NotNull XDebugSession xDebugSession) throws ExecutionException
                    {
                        PureDebugProcess debugProcess = new PureDebugProcess(xDebugSession, environment.getProject());
                        FunctionExecutionInterpreted functionExecution = new FunctionExecutionInterpreted();

                        // Run the Pure function on a background thread
                        new Thread(() ->
                        {
                            try
                            {
                                // Create interpreter and attach debugger listener
                                functionExecution.init(service.getRuntime(), new org.finos.legend.pure.m3.serialization.runtime.Message(""));
                                functionExecution.setDebuggerListener(debugProcess.getDebuggerListener());
                                CoreInstance result = functionExecution.start(function, Lists.immutable.empty());
                                xDebugSession.getConsoleView().print(
                                        "Result: " + (result != null ? result.toString() : "nil") + "\n",
                                        com.intellij.execution.ui.ConsoleViewContentType.NORMAL_OUTPUT);
                            }
                            catch (RuntimeException e)
                            {
                                if (!"Debugger stopped by user".equals(e.getMessage()))
                                {
                                    xDebugSession.getConsoleView().print(
                                            "Execution error: " + e.getMessage() + "\n",
                                            com.intellij.execution.ui.ConsoleViewContentType.ERROR_OUTPUT);
                                }
                            }
                            finally
                            {
                                functionExecution.setDebuggerListener(null);
                                xDebugSession.stop();
                            }
                        }, "Pure-Debug-Execution").start();

                        return debugProcess;
                    }
                });

        return session.getRunContentDescriptor();
    }
}

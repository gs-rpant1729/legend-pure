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

package org.finos.legend.pure.ide.intellij.run;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import org.eclipse.collections.api.factory.Lists;
import org.finos.legend.pure.ide.intellij.service.PureProjectService;
import org.finos.legend.pure.m3.serialization.runtime.PureRuntime;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.runtime.java.interpreted.FunctionExecutionInterpreted;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Run configuration for executing a Pure function by qualified name.
 * <p>
 * The user specifies a function name like "test::myFunction_String_1__String_1_"
 * and the configuration resolves it from the compiled graph and executes it
 * via {@link FunctionExecutionInterpreted}.
 */
public class PureRunConfiguration extends RunConfigurationBase<PureRunConfiguration>
{
    private static final String ATTR_FUNCTION_NAME = "functionQualifiedName";

    private String functionQualifiedName = "";

    public PureRunConfiguration(@NotNull Project project,
                                @NotNull ConfigurationFactory factory,
                                @NotNull String name)
    {
        super(project, factory, name);
    }

    public String getFunctionQualifiedName()
    {
        return functionQualifiedName;
    }

    public void setFunctionQualifiedName(String functionQualifiedName)
    {
        this.functionQualifiedName = functionQualifiedName;
    }

    @Override
    public void readExternal(@NotNull Element element) throws InvalidDataException
    {
        super.readExternal(element);
        functionQualifiedName = element.getAttributeValue(ATTR_FUNCTION_NAME, "");
    }

    @Override
    public void writeExternal(@NotNull Element element) throws WriteExternalException
    {
        super.writeExternal(element);
        element.setAttribute(ATTR_FUNCTION_NAME, functionQualifiedName);
    }

    @Override
    public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor()
    {
        return new PureRunConfigurationEditor();
    }

    @Override
    public @Nullable RunProfileState getState(@NotNull Executor executor,
                                               @NotNull ExecutionEnvironment environment) throws ExecutionException
    {
        return (exec, runner) ->
        {
            PureProjectService service = PureProjectService.getInstance(getProject());
            PureRuntime runtime = service.getRuntime();
            if (runtime == null)
            {
                throw new ExecutionException("Pure runtime not initialized. Please wait for initialization to complete.");
            }

            String effectiveName = resolveEffectiveFunctionName();
            CoreInstance function = runtime.getCoreInstance(effectiveName);
            if (function == null)
            {
                throw new ExecutionException("Function not found: " + effectiveName);
            }

            // Create interpreted execution engine and run
            FunctionExecutionInterpreted functionExecution = new FunctionExecutionInterpreted();
            functionExecution.init(runtime, new org.finos.legend.pure.m3.serialization.runtime.Message(""));

            ProcessHandler processHandler = new PureProcessHandler(function, functionExecution);
            return new com.intellij.execution.DefaultExecutionResult(
                    new com.intellij.execution.impl.ConsoleViewImpl(getProject(), false),
                    processHandler
            );
        };
    }

    /**
     * Returns the function name to execute. When no name is configured, falls back to the
     * {@code go()} function declared in {@code welcome.pure} at the project base directory.
     */
    public String resolveEffectiveFunctionName() throws ExecutionException
    {
        if (!functionQualifiedName.isEmpty())
        {
            return functionQualifiedName;
        }

        String basePath = getProject().getBasePath();
        if (basePath == null)
        {
            throw new ExecutionException(
                    "No function configured and project base path is unavailable.");
        }

        java.nio.file.Path welcomePath = Paths.get(basePath, "welcome.pure");
        if (!Files.exists(welcomePath))
        {
            throw new ExecutionException(
                    "No function configured. Create a welcome.pure at the project root " +
                    "defining a go() function, or specify a function in the run configuration.");
        }

        return extractGoQualifiedName(welcomePath);
    }

    /**
     * Scans {@code welcome.pure} for a no-argument {@code go} function and constructs
     * its Pure qualified name (e.g. {@code go__Any_MANY_} or {@code myPkg::go__Any_MANY_}).
     */
    private static String extractGoQualifiedName(java.nio.file.Path welcomePath) throws ExecutionException
    {
        String content;
        try
        {
            content = new String(Files.readAllBytes(welcomePath), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            throw new ExecutionException("Could not read welcome.pure: " + e.getMessage());
        }

        // Match: function [pkg::]go(): ReturnType[multiplicity]
        Matcher m = Pattern.compile(
                "\\bfunction\\s+(((?:[\\w]+::)*)go)\\s*\\(\\s*\\)\\s*:\\s*([\\w:]+)\\s*\\[([^\\]]+)\\]")
                .matcher(content);
        if (!m.find())
        {
            throw new ExecutionException(
                    "No no-argument 'go' function found in welcome.pure. " +
                    "Expected: function go(): Any[*] { ... }");
        }

        String pkg = m.group(2);
        String returnType = m.group(3);
        String multiplicity = m.group(4).trim();

        // Use the simple type name (last segment if package-qualified)
        String simpleReturnType = returnType.contains("::")
                ? returnType.substring(returnType.lastIndexOf("::") + 2)
                : returnType;

        return pkg + "go__" + simpleReturnType + "_" + encodeMultiplicity(multiplicity) + "_";
    }

    private static String encodeMultiplicity(String multiplicity)
    {
        switch (multiplicity)
        {
            case "*":
            case "0..*":
                return "MANY";
            case "1":
                return "1";
            case "0":
                return "0";
            case "0..1":
                return "$0to1$";
            default:
                return multiplicity.replace("..", "to").replace("*", "MANY");
        }
    }

    /**
     * Simple settings editor with a text field for the function name.
     */
    private class PureRunConfigurationEditor extends SettingsEditor<PureRunConfiguration>
    {
        private final JTextField functionNameField = new JTextField(40);

        @Override
        protected void resetEditorFrom(@NotNull PureRunConfiguration configuration)
        {
            functionNameField.setText(configuration.getFunctionQualifiedName());
        }

        @Override
        protected void applyEditorTo(@NotNull PureRunConfiguration configuration)
        {
            configuration.setFunctionQualifiedName(functionNameField.getText().trim());
        }

        @Override
        protected @NotNull JComponent createEditor()
        {
            JPanel panel = new JPanel(new java.awt.BorderLayout(5, 5));
            panel.add(new JLabel("Function (qualified name):"), java.awt.BorderLayout.WEST);
            panel.add(functionNameField, java.awt.BorderLayout.CENTER);
            return panel;
        }
    }

    /**
     * ProcessHandler that runs Pure function execution on a separate thread.
     */
    private static class PureProcessHandler extends ProcessHandler
    {
        private final CoreInstance function;
        private final FunctionExecutionInterpreted functionExecution;

        PureProcessHandler(CoreInstance function, FunctionExecutionInterpreted functionExecution)
        {
            this.function = function;
            this.functionExecution = functionExecution;
        }

        @Override
        public void startNotify()
        {
            super.startNotify();
            new Thread(() ->
            {
                try
                {
                    CoreInstance result = functionExecution.start(function, Lists.immutable.empty());
                    notifyTextAvailable("Result: " + (result != null ? result.toString() : "nil") + "\n",
                            com.intellij.execution.process.ProcessOutputTypes.STDOUT);
                    notifyTextAvailable("\nProcess finished with exit code 0\n",
                            com.intellij.execution.process.ProcessOutputTypes.SYSTEM);
                }
                catch (Exception e)
                {
                    notifyTextAvailable("Execution error: " + e.getMessage() + "\n",
                            com.intellij.execution.process.ProcessOutputTypes.STDERR);
                    notifyTextAvailable("\nProcess finished with exit code 1\n",
                            com.intellij.execution.process.ProcessOutputTypes.SYSTEM);
                }
                finally
                {
                    notifyProcessTerminated(0);
                }
            }, "Pure-Execution").start();
        }

        @Override
        protected void destroyProcessImpl()
        {
            functionExecution.cancelExecution();
            notifyProcessTerminated(0);
        }

        @Override
        protected void detachProcessImpl()
        {
            notifyProcessDetached();
        }

        @Override
        public boolean detachIsDefault()
        {
            return false;
        }

        @Override
        public @Nullable OutputStream getProcessInput()
        {
            return null;
        }
    }
}

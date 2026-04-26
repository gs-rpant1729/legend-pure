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

import com.intellij.execution.configurations.*;
import com.intellij.openapi.project.Project;
import org.finos.legend.pure.ide.intellij.PureIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Run configuration type for executing Pure functions.
 */
public class PureRunConfigurationType implements ConfigurationType
{
    @Override
    public @NotNull String getDisplayName()
    {
        return "Pure Function";
    }

    @Override
    public String getConfigurationTypeDescription()
    {
        return "Run a Pure function using the interpreted execution engine";
    }

    @Override
    public Icon getIcon()
    {
        return PureIcons.FUNCTION;
    }

    @Override
    public @NotNull String getId()
    {
        return "PureRunConfiguration";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories()
    {
        return new ConfigurationFactory[]{new PureConfigurationFactory(this)};
    }

    private static class PureConfigurationFactory extends ConfigurationFactory
    {
        PureConfigurationFactory(@NotNull ConfigurationType type)
        {
            super(type);
        }

        @Override
        public @NotNull String getId()
        {
            return "PureConfigurationFactory";
        }

        @Override
        public @NotNull RunConfiguration createTemplateConfiguration(@NotNull Project project)
        {
            return new PureRunConfiguration(project, this, "Pure Function");
        }
    }
}

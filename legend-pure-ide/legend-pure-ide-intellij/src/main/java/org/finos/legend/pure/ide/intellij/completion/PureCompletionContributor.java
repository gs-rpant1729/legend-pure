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

package org.finos.legend.pure.ide.intellij.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.finos.legend.pure.ide.intellij.PureIcons;
import org.finos.legend.pure.ide.intellij.PureLanguage;
import org.finos.legend.pure.ide.intellij.service.PureProjectService;
import org.finos.legend.pure.m3.navigation.Instance;
import org.finos.legend.pure.m3.navigation.M3Paths;
import org.finos.legend.pure.m3.navigation.M3Properties;
import org.finos.legend.pure.m3.navigation.ProcessorSupport;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Code completion contributor providing:
 * <ul>
 *   <li>Pure language keywords (Class, function, Enum, etc.)</li>
 *   <li>Package member completion using {@code ProcessorSupport.package_getByUserPath()}</li>
 *   <li>Top-level element names from the compiled graph</li>
 * </ul>
 */
public class PureCompletionContributor extends CompletionContributor
{
    private static final String[] KEYWORDS = {
            "Class", "Association", "Enum", "Profile", "function",
            "import", "native", "extends", "let", "if", "match",
            "true", "false", "new", "copy", "cast", "toOne",
            "map", "filter", "fold", "size", "isEmpty",
            "toString", "println", "assert"
    };

    private static final String[] TYPE_KEYWORDS = {
            "String", "Integer", "Float", "Decimal", "Boolean",
            "Date", "StrictDate", "DateTime", "Number", "Any", "Nil"
    };

    public PureCompletionContributor()
    {
        // Keyword completion
        extend(
                CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(PureLanguage.INSTANCE),
                new CompletionProvider<>()
                {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters,
                                                  @NotNull ProcessingContext context,
                                                  @NotNull CompletionResultSet resultSet)
                    {
                        // Add keywords
                        for (String keyword : KEYWORDS)
                        {
                            resultSet.addElement(LookupElementBuilder.create(keyword)
                                    .bold()
                                    .withTypeText("keyword"));
                        }

                        // Add type keywords
                        for (String type : TYPE_KEYWORDS)
                        {
                            resultSet.addElement(LookupElementBuilder.create(type)
                                    .withIcon(PureIcons.CLASS)
                                    .withTypeText("type"));
                        }

                        // Runtime-backed completion from the compiled graph
                        addPackageMemberCompletions(parameters, resultSet);
                    }
                }
        );
    }

    /**
     * Attempts to resolve the prefix as a package path and offer members.
     * <p>
     * For example, if the user types "meta::pure::" then we look up the package
     * "meta::pure" and offer its children.
     */
    private static void addPackageMemberCompletions(@NotNull CompletionParameters parameters,
                                                    @NotNull CompletionResultSet resultSet)
    {
        PureProjectService service = PureProjectService.getInstance(parameters.getPosition().getProject());
        if (!service.isInitialized())
        {
            return;
        }

        ProcessorSupport processorSupport = service.getProcessorSupport();
        if (processorSupport == null)
        {
            return;
        }

        // Extract the prefix text, looking for package path separators "::"
        String prefix = resultSet.getPrefixMatcher().getPrefix();
        String packagePath = null;

        int lastSep = prefix.lastIndexOf("::");
        if (lastSep >= 0)
        {
            packagePath = prefix.substring(0, lastSep);
        }
        else
        {
            // Complete from root package
            packagePath = "::";
        }

        // Resolve the package
        CoreInstance packageInstance = processorSupport.package_getByUserPath(packagePath);
        if (packageInstance == null)
        {
            return;
        }

        // Check if this is a Package and get children
        if (Instance.instanceOf(packageInstance, M3Paths.Package, processorSupport))
        {
            for (CoreInstance child : packageInstance.getValueForMetaPropertyToMany(M3Properties.children))
            {
                String name = child.getName();
                if (name != null)
                {
                    Icon icon = getIconForInstance(child, processorSupport);
                    String typeName = getTypeNameForInstance(child, processorSupport);

                    resultSet.addElement(LookupElementBuilder.create(name)
                            .withIcon(icon)
                            .withTypeText(typeName)
                            .withTailText(" (" + packagePath + ")", true));
                }
            }
        }
    }

    private static Icon getIconForInstance(CoreInstance instance, ProcessorSupport processorSupport)
    {
        if (Instance.instanceOf(instance, M3Paths.Class, processorSupport))
        {
            return PureIcons.CLASS;
        }
        else if (Instance.instanceOf(instance, M3Paths.Enumeration, processorSupport))
        {
            return PureIcons.ENUM;
        }
        else if (Instance.instanceOf(instance, M3Paths.Association, processorSupport))
        {
            return PureIcons.ASSOCIATION;
        }
        else if (Instance.instanceOf(instance, M3Paths.ConcreteFunctionDefinition, processorSupport))
        {
            return PureIcons.FUNCTION;
        }
        else if (Instance.instanceOf(instance, M3Paths.Package, processorSupport))
        {
            return PureIcons.FILE;
        }
        return PureIcons.FILE;
    }

    private static String getTypeNameForInstance(CoreInstance instance, ProcessorSupport processorSupport)
    {
        if (Instance.instanceOf(instance, M3Paths.Class, processorSupport))
        {
            return "Class";
        }
        else if (Instance.instanceOf(instance, M3Paths.Enumeration, processorSupport))
        {
            return "Enumeration";
        }
        else if (Instance.instanceOf(instance, M3Paths.Association, processorSupport))
        {
            return "Association";
        }
        else if (Instance.instanceOf(instance, M3Paths.ConcreteFunctionDefinition, processorSupport))
        {
            return "Function";
        }
        else if (Instance.instanceOf(instance, M3Paths.Package, processorSupport))
        {
            return "Package";
        }
        return "";
    }
}

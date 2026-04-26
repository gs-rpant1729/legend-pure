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

package org.finos.legend.pure.ide.intellij.navigation;

import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import org.finos.legend.pure.ide.intellij.psi.PureDefinitionElement;
import org.finos.legend.pure.ide.intellij.psi.stubs.PureDefinitionNameIndex;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Enables "Go to Symbol" (Cmd+Alt+O / Ctrl+Alt+Shift+N) for Pure definitions.
 * <p>
 * Queries the {@link PureDefinitionNameIndex} stub index to find all Pure
 * classes, functions, enums, associations, and profiles by name.
 */
public class PureGoToSymbolContributor implements ChooseByNameContributor
{
    @Override
    public String @NotNull [] getNames(@NotNull Project project, boolean includeNonProjectItems)
    {
        Collection<String> keys = StubIndex.getInstance().getAllKeys(
                PureDefinitionNameIndex.KEY, project);
        return keys.toArray(new String[0]);
    }

    @Override
    public NavigationItem @NotNull [] getItemsByName(@NotNull String name,
                                                     @NotNull String pattern,
                                                     @NotNull Project project,
                                                     boolean includeNonProjectItems)
    {
        GlobalSearchScope scope = includeNonProjectItems
                ? GlobalSearchScope.allScope(project)
                : GlobalSearchScope.projectScope(project);

        Collection<PureDefinitionElement> elements = StubIndex.getElements(
                PureDefinitionNameIndex.KEY, name, project, scope, PureDefinitionElement.class);

        List<NavigationItem> items = new ArrayList<>();
        for (PureDefinitionElement element : elements)
        {
            if (element instanceof NavigationItem)
            {
                items.add((NavigationItem) element);
            }
        }
        return items.toArray(new NavigationItem[0]);
    }
}

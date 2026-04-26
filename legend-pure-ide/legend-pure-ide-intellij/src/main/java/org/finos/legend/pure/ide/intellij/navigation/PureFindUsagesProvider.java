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

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import org.finos.legend.pure.ide.intellij.highlight.PureLexerAdaptor;
import org.finos.legend.pure.ide.intellij.parser.PureElementTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Find Usages provider for Pure language elements.
 * <p>
 * Provides word scanning for index building and presentation of Pure
 * elements in the Find Usages UI. Usage search leverages the
 * {@code referenceUsages} property on PackageableElements to find all
 * elements in the graph that reference the target.
 */
public class PureFindUsagesProvider implements FindUsagesProvider
{
    @Override
    public @Nullable WordsScanner getWordsScanner()
    {
        return new DefaultWordsScanner(
                new PureLexerAdaptor(),
                TokenSet.create(PureElementTypes.VALID_STRING),  // identifiers
                TokenSet.create(PureElementTypes.LINE_COMMENT, PureElementTypes.BLOCK_COMMENT),
                TokenSet.create(PureElementTypes.STRING, PureElementTypes.INTEGER, PureElementTypes.FLOAT)
        );
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement)
    {
        // Allow find usages for any identifier token — the actual resolution
        // is done via PureReference.resolve() (which calls Source.navigate())
        return psiElement.getNode() != null &&
                psiElement.getNode().getElementType() == PureElementTypes.VALID_STRING;
    }

    @Override
    public @Nullable String getHelpId(@NotNull PsiElement psiElement)
    {
        return null;
    }

    @Override
    public @NotNull String getType(@NotNull PsiElement element)
    {
        // Determine the type from the containing PSI composite element
        PsiElement parent = element.getParent();
        if (parent != null && parent.getNode() != null)
        {
            if (parent.getNode().getElementType() == PureElementTypes.CLASS_DEFINITION)
            {
                return "class";
            }
            if (parent.getNode().getElementType() == PureElementTypes.FUNCTION_DEFINITION)
            {
                return "function";
            }
            if (parent.getNode().getElementType() == PureElementTypes.ENUM_DEFINITION)
            {
                return "enumeration";
            }
            if (parent.getNode().getElementType() == PureElementTypes.ASSOCIATION_DEFINITION)
            {
                return "association";
            }
        }
        return "element";
    }

    @Override
    public @NotNull String getDescriptiveName(@NotNull PsiElement element)
    {
        return element.getText();
    }

    @Override
    public @NotNull String getNodeText(@NotNull PsiElement element, boolean useFullName)
    {
        return element.getText();
    }
}

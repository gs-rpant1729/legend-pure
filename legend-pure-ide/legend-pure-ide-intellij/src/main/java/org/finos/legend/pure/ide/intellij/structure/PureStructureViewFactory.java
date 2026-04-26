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

package org.finos.legend.pure.ide.intellij.structure;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import org.finos.legend.pure.ide.intellij.PureIcons;
import org.finos.legend.pure.ide.intellij.parser.PureAstWrapperPsiElement;
import org.finos.legend.pure.ide.intellij.parser.PureElementTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Structure view factory for Pure language files.
 * Shows Classes, Functions, Enumerations, Associations, and Profiles
 * as top-level nodes with their properties as children.
 */
public class PureStructureViewFactory implements PsiStructureViewFactory
{
    @Override
    public @Nullable StructureViewBuilder getStructureViewBuilder(@NotNull PsiFile psiFile)
    {
        return new TreeBasedStructureViewBuilder()
        {
            @Override
            public @NotNull StructureViewModel createStructureViewModel(@Nullable Editor editor)
            {
                return new PureStructureViewModel(psiFile);
            }
        };
    }

    private static class PureStructureViewModel extends StructureViewModelBase
            implements StructureViewModel.ElementInfoProvider
    {
        public PureStructureViewModel(@NotNull PsiFile psiFile)
        {
            super(psiFile, new PureStructureViewElement(psiFile));
        }

        @Override
        public boolean isAlwaysShowsPlus(StructureViewTreeElement element)
        {
            return false;
        }

        @Override
        public boolean isAlwaysLeaf(StructureViewTreeElement element)
        {
            return false;
        }
    }

    private static class PureStructureViewElement implements StructureViewTreeElement
    {
        private final PsiElement element;

        public PureStructureViewElement(PsiElement element)
        {
            this.element = element;
        }

        @Override
        public Object getValue()
        {
            return element;
        }

        @Override
        public @NotNull ItemPresentation getPresentation()
        {
            return new ItemPresentation()
            {
                @Override
                public @Nullable String getPresentableText()
                {
                    if (element instanceof PsiFile)
                    {
                        return ((PsiFile) element).getName();
                    }
                    // Extract name from the element (first VALID_STRING child)
                    PsiElement nameElement = findNameElement(element);
                    return nameElement != null ? nameElement.getText() : element.getText();
                }

                @Override
                public @Nullable Icon getIcon(boolean unused)
                {
                    if (element instanceof PsiFile)
                    {
                        return PureIcons.FILE;
                    }
                    if (element.getNode() != null)
                    {
                        if (element.getNode().getElementType() == PureElementTypes.CLASS_DEFINITION)
                        {
                            return PureIcons.CLASS;
                        }
                        if (element.getNode().getElementType() == PureElementTypes.FUNCTION_DEFINITION)
                        {
                            return PureIcons.FUNCTION;
                        }
                        if (element.getNode().getElementType() == PureElementTypes.ENUMERATION_DEFINITION)
                        {
                            return PureIcons.ENUM;
                        }
                        if (element.getNode().getElementType() == PureElementTypes.ASSOCIATION_DEFINITION)
                        {
                            return PureIcons.ASSOCIATION;
                        }
                        if (element.getNode().getElementType() == PureElementTypes.PROFILE_DEFINITION)
                        {
                            return PureIcons.FILE;
                        }
                    }
                    return null;
                }
            };
        }

        @Override
        public TreeElement @NotNull [] getChildren()
        {
            if (element instanceof PsiFile)
            {
                // Collect top-level definitions
                List<TreeElement> children = new ArrayList<>();
                for (PsiElement child : element.getChildren())
                {
                    if (child.getNode() != null)
                    {
                        Object elementType = child.getNode().getElementType();
                        if (elementType == PureElementTypes.CLASS_DEFINITION ||
                                elementType == PureElementTypes.FUNCTION_DEFINITION ||
                                elementType == PureElementTypes.ENUMERATION_DEFINITION ||
                                elementType == PureElementTypes.ASSOCIATION_DEFINITION ||
                                elementType == PureElementTypes.PROFILE_DEFINITION)
                        {
                            children.add(new PureStructureViewElement(child));
                        }
                    }
                }
                return children.toArray(TreeElement.EMPTY_ARRAY);
            }
            return TreeElement.EMPTY_ARRAY;
        }

        @Override
        public void navigate(boolean requestFocus)
        {
            if (element instanceof com.intellij.pom.Navigatable)
            {
                ((com.intellij.pom.Navigatable) element).navigate(requestFocus);
            }
        }

        @Override
        public boolean canNavigate()
        {
            return element instanceof com.intellij.pom.Navigatable &&
                    ((com.intellij.pom.Navigatable) element).canNavigate();
        }

        @Override
        public boolean canNavigateToSource()
        {
            return canNavigate();
        }

        private static PsiElement findNameElement(PsiElement parent)
        {
            // The name is usually the first VALID_STRING after the keyword
            for (PsiElement child : parent.getChildren())
            {
                if (child.getNode() != null &&
                        child.getNode().getElementType() == PureElementTypes.VALID_STRING)
                {
                    return child;
                }
            }
            return null;
        }
    }
}

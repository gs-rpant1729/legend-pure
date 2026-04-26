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

package org.finos.legend.pure.ide.intellij.parser;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * Generic PSI element wrapper for Pure AST nodes.
 * Specific PSI element classes (PureClassDefinition, PureFunctionDefinition, etc.)
 * will extend this as needed for structural features.
 */
public class PureAstWrapperPsiElement extends ASTWrapperPsiElement
{
    public PureAstWrapperPsiElement(@NotNull ASTNode node)
    {
        super(node);
    }
}

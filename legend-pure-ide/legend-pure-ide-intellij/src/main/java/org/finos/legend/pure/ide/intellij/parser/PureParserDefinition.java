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

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.finos.legend.pure.ide.intellij.highlight.PureLexerAdaptor;
import org.finos.legend.pure.ide.intellij.psi.PureDefinitionElement;
import org.jetbrains.annotations.NotNull;

/**
 * ParserDefinition for Pure language files.
 * Provides the lexer, parser, and file/element creation.
 */
public class PureParserDefinition implements ParserDefinition
{
    @Override
    public @NotNull Lexer createLexer(Project project)
    {
        return new PureLexerAdaptor();
    }

    @Override
    public @NotNull PsiParser createParser(Project project)
    {
        return new PurePsiParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType()
    {
        return PureElementTypes.FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens()
    {
        return PureElementTypes.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements()
    {
        return PureElementTypes.STRINGS;
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens()
    {
        return PureElementTypes.WHITESPACES;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node)
    {
        IElementType type = node.getElementType();
        if (type == PureElementTypes.CLASS_DEFINITION ||
                type == PureElementTypes.FUNCTION_DEFINITION ||
                type == PureElementTypes.ASSOCIATION_DEFINITION ||
                type == PureElementTypes.ENUMERATION_DEFINITION ||
                type == PureElementTypes.PROFILE_DEFINITION)
        {
            return new PureDefinitionElement(node);
        }
        return new PureAstWrapperPsiElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider)
    {
        return new PureFile(viewProvider);
    }
}

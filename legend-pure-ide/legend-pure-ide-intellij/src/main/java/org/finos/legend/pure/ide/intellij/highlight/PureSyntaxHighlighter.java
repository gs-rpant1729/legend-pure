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

package org.finos.legend.pure.ide.intellij.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.finos.legend.pure.ide.intellij.parser.PureElementTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Syntax highlighter for Pure language files.
 * Maps Pure token types to IntelliJ text attribute keys for colorization.
 */
public class PureSyntaxHighlighter extends SyntaxHighlighterBase
{
    // Text attribute keys
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("PURE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING_LITERAL =
            createTextAttributesKey("PURE_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("PURE_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey LINE_COMMENT_ATTR =
            createTextAttributesKey("PURE_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("PURE_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("PURE_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("PURE_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey BRACES =
            createTextAttributesKey("PURE_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("PURE_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("PURE_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("PURE_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey COMMA_ATTR =
            createTextAttributesKey("PURE_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey DOT_ATTR =
            createTextAttributesKey("PURE_DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("PURE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey BOOLEAN_LITERAL =
            createTextAttributesKey("PURE_BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DATE_LITERAL =
            createTextAttributesKey("PURE_DATE", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey DSL_TEXT_ATTR =
            createTextAttributesKey("PURE_DSL_TEXT", DefaultLanguageHighlighterColors.TEMPLATE_LANGUAGE_COLOR);
    public static final TextAttributesKey PATH_SEPARATOR_ATTR =
            createTextAttributesKey("PURE_PATH_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING_LITERAL};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT_ATTR};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] BRACE_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] PAREN_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA_ATTR};
    private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT_ATTR};
    private static final TextAttributesKey[] BAD_CHARACTER_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] BOOLEAN_KEYS = new TextAttributesKey[]{BOOLEAN_LITERAL};
    private static final TextAttributesKey[] DATE_KEYS = new TextAttributesKey[]{DATE_LITERAL};
    private static final TextAttributesKey[] DSL_KEYS = new TextAttributesKey[]{DSL_TEXT_ATTR};
    private static final TextAttributesKey[] PATH_SEP_KEYS = new TextAttributesKey[]{PATH_SEPARATOR_ATTR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer()
    {
        return new PureLexerAdaptor();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType)
    {
        // Keywords
        if (PureElementTypes.KEYWORDS.contains(tokenType))
        {
            return KEYWORD_KEYS;
        }

        // String literals
        if (tokenType == PureElementTypes.STRING)
        {
            return STRING_KEYS;
        }

        // Number literals
        if (PureElementTypes.NUMBERS.contains(tokenType))
        {
            return NUMBER_KEYS;
        }

        // Boolean literals
        if (tokenType == PureElementTypes.BOOLEAN || tokenType == PureElementTypes.TRUE || tokenType == PureElementTypes.FALSE)
        {
            return BOOLEAN_KEYS;
        }

        // Date/time literals
        if (tokenType == PureElementTypes.DATE || tokenType == PureElementTypes.STRICTTIME || tokenType == PureElementTypes.LATEST_DATE)
        {
            return DATE_KEYS;
        }

        // Comments
        if (tokenType == PureElementTypes.LINE_COMMENT)
        {
            return LINE_COMMENT_KEYS;
        }
        if (tokenType == PureElementTypes.COMMENT)
        {
            return BLOCK_COMMENT_KEYS;
        }

        // Operators
        if (PureElementTypes.OPERATORS.contains(tokenType))
        {
            return OPERATOR_KEYS;
        }

        // Braces
        if (tokenType == PureElementTypes.CURLY_BRACKET_OPEN || tokenType == PureElementTypes.CURLY_BRACKET_CLOSE)
        {
            return BRACE_KEYS;
        }

        // Brackets
        if (tokenType == PureElementTypes.BRACKET_OPEN || tokenType == PureElementTypes.BRACKET_CLOSE)
        {
            return BRACKET_KEYS;
        }

        // Parentheses
        if (tokenType == PureElementTypes.GROUP_OPEN || tokenType == PureElementTypes.GROUP_CLOSE)
        {
            return PAREN_KEYS;
        }

        // Semicolons
        if (tokenType == PureElementTypes.END_LINE)
        {
            return SEMICOLON_KEYS;
        }

        // Commas
        if (tokenType == PureElementTypes.COMMA)
        {
            return COMMA_KEYS;
        }

        // Dots
        if (tokenType == PureElementTypes.DOT || tokenType == PureElementTypes.DOTDOT)
        {
            return DOT_KEYS;
        }

        // Path separator
        if (tokenType == PureElementTypes.PATH_SEPARATOR)
        {
            return PATH_SEP_KEYS;
        }

        // DSL text
        if (tokenType == PureElementTypes.DSL_TEXT)
        {
            return DSL_KEYS;
        }

        // Identifiers
        if (tokenType == PureElementTypes.VALID_STRING)
        {
            return IDENTIFIER_KEYS;
        }

        // Bad character
        if (tokenType == PureElementTypes.BAD_CHARACTER)
        {
            return BAD_CHARACTER_KEYS;
        }

        return EMPTY_KEYS;
    }
}

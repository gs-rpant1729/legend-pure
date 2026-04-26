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

import com.intellij.lexer.LexerBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.finos.legend.pure.ide.intellij.parser.PureElementTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Bridges the ANTLR M3CoreLexer to IntelliJ's Lexer interface.
 * <p>
 * Since we cannot directly depend on the generated ANTLR lexer class at compile time
 * (it is generated during the Maven build of legend-pure-m3-core), this implementation
 * uses a simplified regex-based lexer that mirrors the M3CoreLexer token rules.
 * This ensures the plugin can highlight Pure files independently of the Maven build.
 * <p>
 * When the generated M3CoreLexer is available on the classpath (via Maven dependency),
 * this can be replaced with an ANTLRLexerAdaptor wrapping the real lexer.
 */
public class PureLexerAdaptor extends LexerBase
{
    private CharSequence buffer;
    private int bufferEnd;
    private int tokenStart;
    private int tokenEnd;
    private IElementType tokenType;
    private int state;

    // Keyword map for fast lookup
    private static final Map<String, IElementType> KEYWORD_MAP = new HashMap<>();

    static
    {
        KEYWORD_MAP.put("Class", PureElementTypes.CLASS);
        KEYWORD_MAP.put("function", PureElementTypes.FUNCTION);
        KEYWORD_MAP.put("native", PureElementTypes.NATIVE);
        KEYWORD_MAP.put("Association", PureElementTypes.ASSOCIATION);
        KEYWORD_MAP.put("Enum", PureElementTypes.ENUM);
        KEYWORD_MAP.put("Profile", PureElementTypes.PROFILE);
        KEYWORD_MAP.put("Measure", PureElementTypes.MEASURE);
        KEYWORD_MAP.put("import", PureElementTypes.IMPORT);
        KEYWORD_MAP.put("extends", PureElementTypes.EXTENDS);
        KEYWORD_MAP.put("projects", PureElementTypes.PROJECTS);
        KEYWORD_MAP.put("Primitive", PureElementTypes.PRIMITIVE);
        KEYWORD_MAP.put("stereotypes", PureElementTypes.STEREOTYPES);
        KEYWORD_MAP.put("tags", PureElementTypes.TAGS);
        KEYWORD_MAP.put("let", PureElementTypes.LET);
        KEYWORD_MAP.put("as", PureElementTypes.AS);
        KEYWORD_MAP.put("all", PureElementTypes.ALL);
        KEYWORD_MAP.put("allVersions", PureElementTypes.ALL_VERSIONS);
        KEYWORD_MAP.put("allVersionsInRange", PureElementTypes.ALL_VERSIONS_IN_RANGE);
        KEYWORD_MAP.put("EnumerationMapping", PureElementTypes.ENUMERATION_MAPPING);
        KEYWORD_MAP.put("true", PureElementTypes.TRUE);
        KEYWORD_MAP.put("false", PureElementTypes.FALSE);
        KEYWORD_MAP.put("composite", PureElementTypes.AGGREGATION_TYPE);
        KEYWORD_MAP.put("shared", PureElementTypes.AGGREGATION_TYPE);
        KEYWORD_MAP.put("none", PureElementTypes.AGGREGATION_TYPE);
        KEYWORD_MAP.put("Error", PureElementTypes.ENFORCEMENT_LEVEL);
        KEYWORD_MAP.put("Warn", PureElementTypes.ENFORCEMENT_LEVEL);
    }

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState)
    {
        this.buffer = buffer;
        this.bufferEnd = endOffset;
        this.tokenStart = startOffset;
        this.tokenEnd = startOffset;
        this.state = initialState;
        advance();
    }

    @Override
    public int getState()
    {
        return state;
    }

    @Override
    public @Nullable IElementType getTokenType()
    {
        return tokenType;
    }

    @Override
    public int getTokenStart()
    {
        return tokenStart;
    }

    @Override
    public int getTokenEnd()
    {
        return tokenEnd;
    }

    @Override
    public void advance()
    {
        tokenStart = tokenEnd;
        if (tokenStart >= bufferEnd)
        {
            tokenType = null;
            return;
        }

        char c = buffer.charAt(tokenStart);

        // Whitespace
        if (Character.isWhitespace(c))
        {
            tokenEnd = tokenStart + 1;
            while (tokenEnd < bufferEnd && Character.isWhitespace(buffer.charAt(tokenEnd)))
            {
                tokenEnd++;
            }
            tokenType = PureElementTypes.WHITESPACE;
            return;
        }

        // Line comment
        if (c == '/' && tokenStart + 1 < bufferEnd && buffer.charAt(tokenStart + 1) == '/')
        {
            tokenEnd = tokenStart + 2;
            while (tokenEnd < bufferEnd && buffer.charAt(tokenEnd) != '\n' && buffer.charAt(tokenEnd) != '\r')
            {
                tokenEnd++;
            }
            tokenType = PureElementTypes.LINE_COMMENT;
            return;
        }

        // Block comment
        if (c == '/' && tokenStart + 1 < bufferEnd && buffer.charAt(tokenStart + 1) == '*')
        {
            tokenEnd = tokenStart + 2;
            while (tokenEnd + 1 < bufferEnd)
            {
                if (buffer.charAt(tokenEnd) == '*' && buffer.charAt(tokenEnd + 1) == '/')
                {
                    tokenEnd += 2;
                    tokenType = PureElementTypes.COMMENT;
                    return;
                }
                tokenEnd++;
            }
            tokenEnd = bufferEnd; // unterminated block comment
            tokenType = PureElementTypes.COMMENT;
            return;
        }

        // String literal
        if (c == '\'')
        {
            tokenEnd = tokenStart + 1;
            while (tokenEnd < bufferEnd)
            {
                char sc = buffer.charAt(tokenEnd);
                if (sc == '\\' && tokenEnd + 1 < bufferEnd)
                {
                    tokenEnd += 2; // skip escaped char
                }
                else if (sc == '\'')
                {
                    tokenEnd++;
                    break;
                }
                else
                {
                    tokenEnd++;
                }
            }
            tokenType = PureElementTypes.STRING;
            return;
        }

        // DSL text (# ... #)
        if (c == '#')
        {
            tokenEnd = tokenStart + 1;
            while (tokenEnd < bufferEnd)
            {
                if (buffer.charAt(tokenEnd) == '#')
                {
                    tokenEnd++;
                    tokenType = PureElementTypes.DSL_TEXT;
                    return;
                }
                tokenEnd++;
            }
            tokenEnd = bufferEnd;
            tokenType = PureElementTypes.DSL_TEXT;
            return;
        }

        // Date literal (%...)
        if (c == '%')
        {
            tokenEnd = tokenStart + 1;
            if (tokenEnd < bufferEnd)
            {
                // %latest
                if (matchesAt(tokenEnd, "latest"))
                {
                    tokenEnd += 6;
                    tokenType = PureElementTypes.LATEST_DATE;
                    return;
                }
                // Date: %YYYY-MM-DDT...
                if (tokenEnd < bufferEnd && (Character.isDigit(buffer.charAt(tokenEnd)) || buffer.charAt(tokenEnd) == '-'))
                {
                    while (tokenEnd < bufferEnd && isDateChar(buffer.charAt(tokenEnd)))
                    {
                        tokenEnd++;
                    }
                    tokenType = PureElementTypes.DATE;
                    return;
                }
            }
            tokenType = PureElementTypes.PERCENT;
            return;
        }

        // Two-character operators
        if (tokenStart + 1 < bufferEnd)
        {
            String twoChar = buffer.subSequence(tokenStart, tokenStart + 2).toString();
            IElementType twoCharType = getTwoCharOperator(twoChar);
            if (twoCharType != null)
            {
                tokenEnd = tokenStart + 2;
                tokenType = twoCharType;
                return;
            }
        }

        // Single-character tokens
        IElementType singleCharType = getSingleCharToken(c);
        if (singleCharType != null)
        {
            tokenEnd = tokenStart + 1;
            tokenType = singleCharType;
            return;
        }

        // Numbers
        if (Character.isDigit(c))
        {
            tokenEnd = tokenStart;
            scanNumber();
            return;
        }

        // Tilde-prefixed constraint/mapping tokens
        if (c == '~')
        {
            tokenEnd = tokenStart + 1;
            IElementType tildeToken = scanTildeToken();
            if (tildeToken != null)
            {
                tokenType = tildeToken;
                return;
            }
            tokenType = PureElementTypes.TILDE;
            return;
        }

        // Identifiers and keywords
        if (isIdentifierStart(c))
        {
            tokenEnd = tokenStart + 1;
            while (tokenEnd < bufferEnd && isIdentifierPart(buffer.charAt(tokenEnd)))
            {
                tokenEnd++;
            }
            String word = buffer.subSequence(tokenStart, tokenEnd).toString();
            IElementType keywordType = KEYWORD_MAP.get(word);
            tokenType = (keywordType != null) ? keywordType : PureElementTypes.VALID_STRING;
            return;
        }

        // Bad character
        tokenEnd = tokenStart + 1;
        tokenType = PureElementTypes.BAD_CHARACTER;
    }

    @Override
    public @NotNull CharSequence getBufferSequence()
    {
        return buffer;
    }

    @Override
    public int getBufferEnd()
    {
        return bufferEnd;
    }

    // ==================== Helpers ====================

    private IElementType getTwoCharOperator(String s)
    {
        switch (s)
        {
            case "::": return PureElementTypes.PATH_SEPARATOR;
            case "->": return PureElementTypes.ARROW;
            case "&&": return PureElementTypes.AND;
            case "||": return PureElementTypes.OR;
            case "==": return PureElementTypes.TEST_EQUAL;
            case "!=": return PureElementTypes.TEST_NOT_EQUAL;
            case "..": return PureElementTypes.DOTDOT;
            case "<=": return PureElementTypes.LESSTHANEQUAL;
            case ">=": return PureElementTypes.GREATERTHANEQUAL;
            default: return null;
        }
    }

    private IElementType getSingleCharToken(char c)
    {
        switch (c)
        {
            case '{': return PureElementTypes.CURLY_BRACKET_OPEN;
            case '}': return PureElementTypes.CURLY_BRACKET_CLOSE;
            case '[': return PureElementTypes.BRACKET_OPEN;
            case ']': return PureElementTypes.BRACKET_CLOSE;
            case '(': return PureElementTypes.GROUP_OPEN;
            case ')': return PureElementTypes.GROUP_CLOSE;
            case ':': return PureElementTypes.COLON;
            case '.': return PureElementTypes.DOT;
            case '$': return PureElementTypes.DOLLAR;
            case ';': return PureElementTypes.END_LINE;
            case ',': return PureElementTypes.COMMA;
            case '|': return PureElementTypes.PIPE;
            case '?': return PureElementTypes.QUESTION;
            case '^': return PureElementTypes.NEW_SYMBOL;
            case '@': return PureElementTypes.AT;
            case '=': return PureElementTypes.EQUAL;
            case '!': return PureElementTypes.NOT;
            case '+': return PureElementTypes.PLUS;
            case '*': return PureElementTypes.STAR;
            case '-': return PureElementTypes.MINUS;
            case '/': return PureElementTypes.DIVIDE;
            case '<': return PureElementTypes.LESSTHAN;
            case '>': return PureElementTypes.GREATERTHAN;
            case '\u2286': return PureElementTypes.SUBSET;
            default: return null;
        }
    }

    private void scanNumber()
    {
        tokenEnd = tokenStart;
        while (tokenEnd < bufferEnd && Character.isDigit(buffer.charAt(tokenEnd)))
        {
            tokenEnd++;
        }
        if (tokenEnd < bufferEnd && buffer.charAt(tokenEnd) == '.')
        {
            int dotPos = tokenEnd;
            tokenEnd++;
            if (tokenEnd < bufferEnd && Character.isDigit(buffer.charAt(tokenEnd)))
            {
                while (tokenEnd < bufferEnd && Character.isDigit(buffer.charAt(tokenEnd)))
                {
                    tokenEnd++;
                }
                // Check for exponent
                if (tokenEnd < bufferEnd && (buffer.charAt(tokenEnd) == 'e' || buffer.charAt(tokenEnd) == 'E'))
                {
                    tokenEnd++;
                    if (tokenEnd < bufferEnd && (buffer.charAt(tokenEnd) == '+' || buffer.charAt(tokenEnd) == '-'))
                    {
                        tokenEnd++;
                    }
                    while (tokenEnd < bufferEnd && Character.isDigit(buffer.charAt(tokenEnd)))
                    {
                        tokenEnd++;
                    }
                }
                // Check for decimal suffix
                if (tokenEnd < bufferEnd && (buffer.charAt(tokenEnd) == 'd' || buffer.charAt(tokenEnd) == 'D'))
                {
                    tokenEnd++;
                    tokenType = PureElementTypes.DECIMAL;
                }
                else if (tokenEnd < bufferEnd && (buffer.charAt(tokenEnd) == 'f' || buffer.charAt(tokenEnd) == 'F'))
                {
                    tokenEnd++;
                    tokenType = PureElementTypes.FLOAT;
                }
                else
                {
                    tokenType = PureElementTypes.FLOAT;
                }
            }
            else
            {
                // Just digits followed by dot — back up, treat as integer
                tokenEnd = dotPos;
                tokenType = PureElementTypes.INTEGER;
            }
        }
        else if (tokenEnd < bufferEnd && (buffer.charAt(tokenEnd) == 'd' || buffer.charAt(tokenEnd) == 'D'))
        {
            tokenEnd++;
            tokenType = PureElementTypes.DECIMAL;
        }
        else
        {
            tokenType = PureElementTypes.INTEGER;
        }
    }

    private IElementType scanTildeToken()
    {
        // Check for ~src, ~filter, ~groupBy, ~canAggregate, etc.
        String[][] tildeTokens = {
                {"src", null},
                {"filter", null},
                {"groupBy", null},
                {"canAggregate", null},
                {"groupByFunctions", null},
                {"aggregateValues", null},
                {"mapFn", null},
                {"aggregateFn", null},
                {"owner", null},
                {"externalId", null},
                {"function", null},
                {"enforcementLevel", null},
                {"message", null},
        };
        IElementType[] tildeTypes = {
                PureElementTypes.MAPPING_SRC,
                PureElementTypes.MAPPING_FILTER,
                PureElementTypes.MAPPING_GROUPBY,
                PureElementTypes.CAN_AGGREGATE,
                PureElementTypes.GROUP_BY_FUNCTIONS,
                PureElementTypes.AGGREGATE_VALUES,
                PureElementTypes.MAP_FN,
                PureElementTypes.AGGREGATE_FN,
                PureElementTypes.CONSTRAINT_OWNER,
                PureElementTypes.CONSTRAINT_EXTERNAL_ID,
                PureElementTypes.CONSTRAINT_FUNCTION,
                PureElementTypes.CONSTRAINT_ENFORCEMENT,
                PureElementTypes.CONSTRAINT_MESSAGE,
        };

        for (int i = 0; i < tildeTokens.length; i++)
        {
            if (matchesAt(tokenEnd, tildeTokens[i][0]))
            {
                tokenEnd += tildeTokens[i][0].length();
                return tildeTypes[i];
            }
        }
        return null;
    }

    private boolean matchesAt(int offset, String text)
    {
        if (offset + text.length() > bufferEnd)
        {
            return false;
        }
        for (int i = 0; i < text.length(); i++)
        {
            if (buffer.charAt(offset + i) != text.charAt(i))
            {
                return false;
            }
        }
        return true;
    }

    private boolean isIdentifierStart(char c)
    {
        return Character.isLetter(c) || c == '_';
    }

    private boolean isIdentifierPart(char c)
    {
        return Character.isLetterOrDigit(c) || c == '_' || c == '$';
    }

    private boolean isDateChar(char c)
    {
        return Character.isDigit(c) || c == '-' || c == 'T' || c == ':' || c == '.' || c == '+';
    }
}

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
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * PSI Parser for Pure language files.
 * <p>
 * This parser builds a lightweight PSI tree from the lexer token stream.
 * It recognizes top-level constructs (Class, function, Association, Enum, Profile,
 * import) and creates composite PSI nodes for them.
 * <p>
 * Unlike the full M3AntlrParser (which builds the CoreInstance graph),
 * this parser only needs to create enough structure for IDE features
 * like structure view, folding, and navigation.
 */
public class PurePsiParser implements PsiParser
{
    @Override
    public @NotNull ASTNode parse(@NotNull IElementType root, @NotNull PsiBuilder builder)
    {
        PsiBuilder.Marker rootMarker = builder.mark();

        while (!builder.eof())
        {
            IElementType tokenType = builder.getTokenType();

            if (tokenType == PureElementTypes.IMPORT)
            {
                parseImportGroup(builder);
            }
            else if (tokenType == PureElementTypes.CLASS)
            {
                parseClassDefinition(builder);
            }
            else if (tokenType == PureElementTypes.FUNCTION || tokenType == PureElementTypes.NATIVE)
            {
                parseFunctionDefinition(builder);
            }
            else if (tokenType == PureElementTypes.ASSOCIATION)
            {
                parseAssociationDefinition(builder);
            }
            else if (tokenType == PureElementTypes.ENUM)
            {
                parseEnumerationDefinition(builder);
            }
            else if (tokenType == PureElementTypes.PROFILE)
            {
                parseProfileDefinition(builder);
            }
            else if (tokenType == PureElementTypes.MEASURE)
            {
                parseGenericBlock(builder, PureElementTypes.CLASS_DEFINITION, "Measure definition");
            }
            else
            {
                // Skip unexpected tokens
                builder.advanceLexer();
            }
        }

        rootMarker.done(root);
        return builder.getTreeBuilt();
    }

    private void parseImportGroup(PsiBuilder builder)
    {
        PsiBuilder.Marker marker = builder.mark();
        builder.advanceLexer(); // consume 'import'

        // Consume the package path (VALID_STRING, PATH_SEPARATOR, STAR, etc.) until END_LINE
        while (!builder.eof())
        {
            IElementType current = builder.getTokenType();
            if (current == PureElementTypes.END_LINE)
            {
                builder.advanceLexer();
                break;
            }
            builder.advanceLexer();
        }

        marker.done(PureElementTypes.IMPORT_GROUP);
    }

    private void parseClassDefinition(PsiBuilder builder)
    {
        PsiBuilder.Marker marker = builder.mark();
        builder.advanceLexer(); // consume 'Class'

        // Consume class name/path and any type parameters, stereotypes, constraints until we hit '{'
        skipToOpenBrace(builder);

        // Parse the body (everything between { and matching })
        parseBalancedBraces(builder);

        marker.done(PureElementTypes.CLASS_DEFINITION);
    }

    private void parseFunctionDefinition(PsiBuilder builder)
    {
        PsiBuilder.Marker marker = builder.mark();

        // Could be 'native' 'function' or just 'function'
        if (builder.getTokenType() == PureElementTypes.NATIVE)
        {
            builder.advanceLexer(); // consume 'native'
        }
        builder.advanceLexer(); // consume 'function'

        // Consume function signature until we hit '{' or ';' (for native functions)
        while (!builder.eof())
        {
            IElementType current = builder.getTokenType();
            if (current == PureElementTypes.CURLY_BRACKET_OPEN)
            {
                parseBalancedBraces(builder);
                break;
            }
            if (current == PureElementTypes.END_LINE)
            {
                builder.advanceLexer();
                break;
            }
            builder.advanceLexer();
        }

        marker.done(PureElementTypes.FUNCTION_DEFINITION);
    }

    private void parseAssociationDefinition(PsiBuilder builder)
    {
        parseGenericBlock(builder, PureElementTypes.ASSOCIATION_DEFINITION, "Association definition");
    }

    private void parseEnumerationDefinition(PsiBuilder builder)
    {
        parseGenericBlock(builder, PureElementTypes.ENUMERATION_DEFINITION, "Enum definition");
    }

    private void parseProfileDefinition(PsiBuilder builder)
    {
        parseGenericBlock(builder, PureElementTypes.PROFILE_DEFINITION, "Profile definition");
    }

    /**
     * Generic parser for block-style definitions (keyword + name + { body }).
     */
    private void parseGenericBlock(PsiBuilder builder, IElementType elementType, String errorMessage)
    {
        PsiBuilder.Marker marker = builder.mark();
        builder.advanceLexer(); // consume keyword

        skipToOpenBrace(builder);
        parseBalancedBraces(builder);

        marker.done(elementType);
    }

    /**
     * Skip tokens until we encounter an open brace or reach EOF.
     */
    private void skipToOpenBrace(PsiBuilder builder)
    {
        while (!builder.eof())
        {
            if (builder.getTokenType() == PureElementTypes.CURLY_BRACKET_OPEN)
            {
                return;
            }
            builder.advanceLexer();
        }
    }

    /**
     * Parse balanced braces { ... }, consuming the open and close braces
     * and all content in between, handling nesting.
     */
    private void parseBalancedBraces(PsiBuilder builder)
    {
        if (builder.eof() || builder.getTokenType() != PureElementTypes.CURLY_BRACKET_OPEN)
        {
            return;
        }

        builder.advanceLexer(); // consume '{'
        int depth = 1;

        while (!builder.eof() && depth > 0)
        {
            IElementType current = builder.getTokenType();
            if (current == PureElementTypes.CURLY_BRACKET_OPEN)
            {
                depth++;
            }
            else if (current == PureElementTypes.CURLY_BRACKET_CLOSE)
            {
                depth--;
            }
            builder.advanceLexer();
        }
    }
}

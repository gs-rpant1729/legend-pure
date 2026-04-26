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

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.finos.legend.pure.ide.intellij.PureLanguage;
import org.finos.legend.pure.ide.intellij.psi.stubs.PureStubElementTypes;

/**
 * Defines all IElementType constants for Pure PSI elements.
 * Token types mirror the ANTLR M3CoreLexer token names.
 */
public final class PureElementTypes
{
    // File
    public static final IFileElementType FILE = new IFileElementType(PureLanguage.INSTANCE);

    // ==================== Token Types (from M3CoreLexer) ====================

    // Keywords
    public static final IElementType CLASS = new PureTokenType("CLASS");
    public static final IElementType FUNCTION = new PureTokenType("FUNCTION");
    public static final IElementType NATIVE = new PureTokenType("NATIVE");
    public static final IElementType ASSOCIATION = new PureTokenType("ASSOCIATION");
    public static final IElementType ENUM = new PureTokenType("ENUM");
    public static final IElementType PROFILE = new PureTokenType("PROFILE");
    public static final IElementType MEASURE = new PureTokenType("MEASURE");
    public static final IElementType IMPORT = new PureTokenType("IMPORT");
    public static final IElementType EXTENDS = new PureTokenType("EXTENDS");
    public static final IElementType PROJECTS = new PureTokenType("PROJECTS");
    public static final IElementType PRIMITIVE = new PureTokenType("PRIMITIVE");
    public static final IElementType STEREOTYPES = new PureTokenType("STEREOTYPES");
    public static final IElementType TAGS = new PureTokenType("TAGS");
    public static final IElementType LET = new PureTokenType("LET");
    public static final IElementType AS = new PureTokenType("AS");
    public static final IElementType ALL = new PureTokenType("ALL");
    public static final IElementType ALL_VERSIONS = new PureTokenType("ALL_VERSIONS");
    public static final IElementType ALL_VERSIONS_IN_RANGE = new PureTokenType("ALL_VERSIONS_IN_RANGE");
    public static final IElementType ENUMERATION_MAPPING = new PureTokenType("ENUMERATION_MAPPING");

    // Literals
    public static final IElementType STRING = new PureTokenType("STRING");
    public static final IElementType BOOLEAN = new PureTokenType("BOOLEAN");
    public static final IElementType TRUE = new PureTokenType("TRUE");
    public static final IElementType FALSE = new PureTokenType("FALSE");
    public static final IElementType INTEGER = new PureTokenType("INTEGER");
    public static final IElementType FLOAT = new PureTokenType("FLOAT");
    public static final IElementType DECIMAL = new PureTokenType("DECIMAL");
    public static final IElementType DATE = new PureTokenType("DATE");
    public static final IElementType STRICTTIME = new PureTokenType("STRICTTIME");
    public static final IElementType LATEST_DATE = new PureTokenType("LATEST_DATE");

    // Operators
    public static final IElementType AND = new PureTokenType("AND");
    public static final IElementType OR = new PureTokenType("OR");
    public static final IElementType NOT = new PureTokenType("NOT");
    public static final IElementType EQUAL = new PureTokenType("EQUAL");
    public static final IElementType TEST_EQUAL = new PureTokenType("TEST_EQUAL");
    public static final IElementType TEST_NOT_EQUAL = new PureTokenType("TEST_NOT_EQUAL");
    public static final IElementType ARROW = new PureTokenType("ARROW");
    public static final IElementType PLUS = new PureTokenType("PLUS");
    public static final IElementType MINUS = new PureTokenType("MINUS");
    public static final IElementType STAR = new PureTokenType("STAR");
    public static final IElementType DIVIDE = new PureTokenType("DIVIDE");
    public static final IElementType LESSTHAN = new PureTokenType("LESSTHAN");
    public static final IElementType LESSTHANEQUAL = new PureTokenType("LESSTHANEQUAL");
    public static final IElementType GREATERTHAN = new PureTokenType("GREATERTHAN");
    public static final IElementType GREATERTHANEQUAL = new PureTokenType("GREATERTHANEQUAL");
    public static final IElementType PERCENT = new PureTokenType("PERCENT");
    public static final IElementType SUBSET = new PureTokenType("SUBSET");

    // Punctuation
    public static final IElementType CURLY_BRACKET_OPEN = new PureTokenType("CURLY_BRACKET_OPEN");
    public static final IElementType CURLY_BRACKET_CLOSE = new PureTokenType("CURLY_BRACKET_CLOSE");
    public static final IElementType BRACKET_OPEN = new PureTokenType("BRACKET_OPEN");
    public static final IElementType BRACKET_CLOSE = new PureTokenType("BRACKET_CLOSE");
    public static final IElementType GROUP_OPEN = new PureTokenType("GROUP_OPEN");
    public static final IElementType GROUP_CLOSE = new PureTokenType("GROUP_CLOSE");
    public static final IElementType COLON = new PureTokenType("COLON");
    public static final IElementType DOT = new PureTokenType("DOT");
    public static final IElementType DOTDOT = new PureTokenType("DOTDOT");
    public static final IElementType DOLLAR = new PureTokenType("DOLLAR");
    public static final IElementType END_LINE = new PureTokenType("END_LINE");
    public static final IElementType COMMA = new PureTokenType("COMMA");
    public static final IElementType PIPE = new PureTokenType("PIPE");
    public static final IElementType TILDE = new PureTokenType("TILDE");
    public static final IElementType QUESTION = new PureTokenType("QUESTION");
    public static final IElementType NEW_SYMBOL = new PureTokenType("NEW_SYMBOL");
    public static final IElementType AT = new PureTokenType("AT");
    public static final IElementType PATH_SEPARATOR = new PureTokenType("PATH_SEPARATOR");

    // Identifiers
    public static final IElementType VALID_STRING = new PureTokenType("VALID_STRING");
    public static final IElementType AGGREGATION_TYPE = new PureTokenType("AGGREGATION_TYPE");
    public static final IElementType ENFORCEMENT_LEVEL = new PureTokenType("ENFORCEMENT_LEVEL");

    // DSL
    public static final IElementType DSL_TEXT = new PureTokenType("DSL_TEXT");

    // File names
    public static final IElementType FILE_NAME = new PureTokenType("FILE_NAME");
    public static final IElementType FILE_NAME_END = new PureTokenType("FILE_NAME_END");

    // Mapping-specific
    public static final IElementType MAPPING_SRC = new PureTokenType("MAPPING_SRC");
    public static final IElementType MAPPING_FILTER = new PureTokenType("MAPPING_FILTER");
    public static final IElementType MAPPING_GROUPBY = new PureTokenType("MAPPING_GROUPBY");

    // Constraint-specific
    public static final IElementType CAN_AGGREGATE = new PureTokenType("CAN_AGGREGATE");
    public static final IElementType GROUP_BY_FUNCTIONS = new PureTokenType("GROUP_BY_FUNCTIONS");
    public static final IElementType AGGREGATE_VALUES = new PureTokenType("AGGREGATE_VALUES");
    public static final IElementType MAP_FN = new PureTokenType("MAP_FN");
    public static final IElementType AGGREGATE_FN = new PureTokenType("AGGREGATE_FN");
    public static final IElementType CONSTRAINT_OWNER = new PureTokenType("CONSTRAINT_OWNER");
    public static final IElementType CONSTRAINT_EXTERNAL_ID = new PureTokenType("CONSTRAINT_EXTERNAL_ID");
    public static final IElementType CONSTRAINT_FUNCTION = new PureTokenType("CONSTRAINT_FUNCTION");
    public static final IElementType CONSTRAINT_ENFORCEMENT = new PureTokenType("CONSTRAINT_ENFORCEMENT");
    public static final IElementType CONSTRAINT_MESSAGE = new PureTokenType("CONSTRAINT_MESSAGE");

    // Whitespace and Comments
    public static final IElementType WHITESPACE = new PureTokenType("WHITESPACE");
    public static final IElementType COMMENT = new PureTokenType("COMMENT");
    public static final IElementType BLOCK_COMMENT = COMMENT; // alias: Pure uses /* */ block comments mapped to COMMENT
    public static final IElementType LINE_COMMENT = new PureTokenType("LINE_COMMENT");

    // Bad character (error token)
    public static final IElementType BAD_CHARACTER = new PureTokenType("BAD_CHARACTER");

    // ==================== PSI Composite Element Types ====================

    // Stub-aware element types for top-level definitions
    public static final IElementType CLASS_DEFINITION = PureStubElementTypes.CLASS;
    public static final IElementType FUNCTION_DEFINITION = PureStubElementTypes.FUNCTION;
    public static final IElementType ASSOCIATION_DEFINITION = PureStubElementTypes.ASSOCIATION;
    public static final IElementType ENUMERATION_DEFINITION = PureStubElementTypes.ENUM;
    public static final IElementType ENUM_DEFINITION = PureStubElementTypes.ENUM; // alias
    public static final IElementType PROFILE_DEFINITION = PureStubElementTypes.PROFILE;
    public static final IElementType PROPERTY_DEFINITION = new PureCompositeElementType("PROPERTY_DEFINITION");
    public static final IElementType PARAMETER_LIST = new PureCompositeElementType("PARAMETER_LIST");
    public static final IElementType EXPRESSION_SEQUENCE = new PureCompositeElementType("EXPRESSION_SEQUENCE");
    public static final IElementType TYPE_REFERENCE = new PureCompositeElementType("TYPE_REFERENCE");
    public static final IElementType VARIABLE_EXPRESSION = new PureCompositeElementType("VARIABLE_EXPRESSION");
    public static final IElementType FUNCTION_EXPRESSION = new PureCompositeElementType("FUNCTION_EXPRESSION");
    public static final IElementType IMPORT_GROUP = new PureCompositeElementType("IMPORT_GROUP");
    public static final IElementType PACKAGE_DECLARATION = new PureCompositeElementType("PACKAGE_DECLARATION");
    public static final IElementType STEREOTYPE_REFERENCE = new PureCompositeElementType("STEREOTYPE_REFERENCE");
    public static final IElementType TAGGED_VALUE = new PureCompositeElementType("TAGGED_VALUE");
    public static final IElementType CONSTRAINT_DEFINITION = new PureCompositeElementType("CONSTRAINT_DEFINITION");
    public static final IElementType MULTIPLICITY = new PureCompositeElementType("MULTIPLICITY");
    public static final IElementType GENERALIZATION = new PureCompositeElementType("GENERALIZATION");

    // ==================== Token Sets ====================

    public static final TokenSet KEYWORDS = TokenSet.create(
            CLASS, FUNCTION, NATIVE, ASSOCIATION, ENUM, PROFILE, MEASURE,
            IMPORT, EXTENDS, PROJECTS, PRIMITIVE, STEREOTYPES, TAGS, LET, AS,
            ALL, ALL_VERSIONS, ALL_VERSIONS_IN_RANGE, ENUMERATION_MAPPING
    );

    public static final TokenSet STRINGS = TokenSet.create(STRING);

    public static final TokenSet NUMBERS = TokenSet.create(INTEGER, FLOAT, DECIMAL);

    public static final TokenSet BOOLEANS = TokenSet.create(BOOLEAN, TRUE, FALSE);

    public static final TokenSet COMMENTS = TokenSet.create(COMMENT, LINE_COMMENT);

    public static final TokenSet WHITESPACES = TokenSet.create(WHITESPACE);

    public static final TokenSet LITERALS = TokenSet.create(
            STRING, INTEGER, FLOAT, DECIMAL, BOOLEAN, TRUE, FALSE,
            DATE, STRICTTIME, LATEST_DATE
    );

    public static final TokenSet OPERATORS = TokenSet.create(
            AND, OR, NOT, EQUAL, TEST_EQUAL, TEST_NOT_EQUAL, ARROW,
            PLUS, MINUS, STAR, DIVIDE, LESSTHAN, LESSTHANEQUAL,
            GREATERTHAN, GREATERTHANEQUAL, PERCENT, SUBSET
    );

    private PureElementTypes()
    {
        // utility class
    }
}

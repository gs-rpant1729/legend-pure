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

package org.finos.legend.pure.ide.intellij;

import org.finos.legend.pure.ide.intellij.parser.PureElementTypes;
import org.finos.legend.pure.ide.intellij.psi.stubs.PureStubElementTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for PureElementTypes.
 */
class PureElementTypesTest
{
    @Test
    void testTokenTypesAreDefined()
    {
        assertNotNull(PureElementTypes.CLASS);
        assertNotNull(PureElementTypes.FUNCTION);
        assertNotNull(PureElementTypes.ENUM);
        assertNotNull(PureElementTypes.ASSOCIATION);
        assertNotNull(PureElementTypes.VALID_STRING);
        assertNotNull(PureElementTypes.STRING);
        assertNotNull(PureElementTypes.INTEGER);
    }

    @Test
    void testCompositeTypesAreStubBacked()
    {
        // Definition types should be stub-backed IStubElementType instances
        assertSame(PureStubElementTypes.CLASS, PureElementTypes.CLASS_DEFINITION);
        assertSame(PureStubElementTypes.FUNCTION, PureElementTypes.FUNCTION_DEFINITION);
        assertSame(PureStubElementTypes.ASSOCIATION, PureElementTypes.ASSOCIATION_DEFINITION);
        assertSame(PureStubElementTypes.ENUM, PureElementTypes.ENUMERATION_DEFINITION);
        assertSame(PureStubElementTypes.PROFILE, PureElementTypes.PROFILE_DEFINITION);
    }

    @Test
    void testTokenSetsNotEmpty()
    {
        assertTrue(PureElementTypes.KEYWORDS.getTypes().length > 0);
        assertTrue(PureElementTypes.COMMENTS.getTypes().length > 0);
        assertTrue(PureElementTypes.LITERALS.getTypes().length > 0);
        assertTrue(PureElementTypes.OPERATORS.getTypes().length > 0);
    }

    @Test
    void testFileElementType()
    {
        assertNotNull(PureElementTypes.FILE);
    }
}

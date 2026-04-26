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

import org.finos.legend.pure.ide.intellij.psi.PureDefinitionElement;
import org.finos.legend.pure.ide.intellij.psi.stubs.PureStubElementTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the PSI stub infrastructure.
 */
class PureStubTest
{
    @Test
    void testStubElementTypesAreDefined()
    {
        assertNotNull(PureStubElementTypes.CLASS);
        assertNotNull(PureStubElementTypes.FUNCTION);
        assertNotNull(PureStubElementTypes.ENUM);
        assertNotNull(PureStubElementTypes.ASSOCIATION);
        assertNotNull(PureStubElementTypes.PROFILE);
    }

    @Test
    void testStubElementTypeExternalIds()
    {
        assertEquals("pure.Class", PureStubElementTypes.CLASS.getExternalId());
        assertEquals("pure.Function", PureStubElementTypes.FUNCTION.getExternalId());
        assertEquals("pure.Enum", PureStubElementTypes.ENUM.getExternalId());
        assertEquals("pure.Association", PureStubElementTypes.ASSOCIATION.getExternalId());
        assertEquals("pure.Profile", PureStubElementTypes.PROFILE.getExternalId());
    }

    @Test
    void testGetTypeForKind()
    {
        assertSame(PureStubElementTypes.CLASS, PureStubElementTypes.getTypeForKind("Class"));
        assertSame(PureStubElementTypes.FUNCTION, PureStubElementTypes.getTypeForKind("Function"));
        assertSame(PureStubElementTypes.ENUM, PureStubElementTypes.getTypeForKind("Enum"));
        assertSame(PureStubElementTypes.ASSOCIATION, PureStubElementTypes.getTypeForKind("Association"));
        assertSame(PureStubElementTypes.PROFILE, PureStubElementTypes.getTypeForKind("Profile"));
    }

    @Test
    void testGetTypeForKindFallback()
    {
        // Unknown kind should fall back to CLASS
        assertSame(PureStubElementTypes.CLASS, PureStubElementTypes.getTypeForKind("Unknown"));
    }

    @Test
    void testDefinitionKind()
    {
        assertEquals("Class", PureStubElementTypes.CLASS.getDefinitionKind());
        assertEquals("Function", PureStubElementTypes.FUNCTION.getDefinitionKind());
        assertEquals("Enum", PureStubElementTypes.ENUM.getDefinitionKind());
    }
}

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

package org.finos.legend.pure.ide.intellij.psi;

import com.intellij.psi.stubs.StubElement;

/**
 * Stub for a Pure named definition element (class, function, enum, etc.).
 * <p>
 * Stores the element's name and package path, enabling fast index lookups
 * without loading the full PSI tree from disk.
 */
public interface PureDefinitionStub extends StubElement<PureDefinitionElement>
{
    /**
     * The simple name of the definition (e.g., "MyClass").
     */
    String getName();

    /**
     * The package path (e.g., "my::package"). May be null or empty.
     */
    String getPackagePath();

    /**
     * The kind of definition (e.g., "Class", "Function", "Enum").
     */
    String getDefinitionKind();
}

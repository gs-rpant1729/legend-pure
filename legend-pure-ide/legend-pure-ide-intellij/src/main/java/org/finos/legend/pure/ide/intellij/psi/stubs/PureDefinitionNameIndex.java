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

package org.finos.legend.pure.ide.intellij.psi.stubs;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.finos.legend.pure.ide.intellij.psi.PureDefinitionElement;
import org.jetbrains.annotations.NotNull;

/**
 * Stub index for looking up Pure definitions by their simple name.
 * <p>
 * For example, looking up "MyClass" returns all PureDefinitionElement
 * instances named "MyClass" across all files, regardless of package.
 * <p>
 * Used by Go-to Symbol, Find Usages, and rename refactoring.
 */
public class PureDefinitionNameIndex extends StringStubIndexExtension<PureDefinitionElement>
{
    public static final StubIndexKey<String, PureDefinitionElement> KEY =
            StubIndexKey.createIndexKey("pure.definition.name");

    @Override
    public @NotNull StubIndexKey<String, PureDefinitionElement> getKey()
    {
        return KEY;
    }

    @Override
    public int getVersion()
    {
        return 1;
    }
}

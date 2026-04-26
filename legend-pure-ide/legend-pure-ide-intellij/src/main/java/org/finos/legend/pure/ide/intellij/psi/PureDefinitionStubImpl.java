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

import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import org.finos.legend.pure.ide.intellij.psi.stubs.PureStubElementTypes;
import org.jetbrains.annotations.Nullable;

/**
 * Concrete stub implementation for Pure definitions.
 */
public class PureDefinitionStubImpl extends StubBase<PureDefinitionElement> implements PureDefinitionStub
{
    private final String name;
    private final String packagePath;
    private final String definitionKind;

    public PureDefinitionStubImpl(@Nullable StubElement parent,
                                  @Nullable String name,
                                  @Nullable String packagePath,
                                  String definitionKind)
    {
        super(parent, PureStubElementTypes.getTypeForKind(definitionKind));
        this.name = name;
        this.packagePath = packagePath;
        this.definitionKind = definitionKind;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getPackagePath()
    {
        return packagePath;
    }

    @Override
    public String getDefinitionKind()
    {
        return definitionKind;
    }
}

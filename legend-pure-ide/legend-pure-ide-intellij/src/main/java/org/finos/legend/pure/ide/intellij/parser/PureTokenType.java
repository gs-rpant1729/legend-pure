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
import org.finos.legend.pure.ide.intellij.PureLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Token-level element type for Pure lexer tokens.
 */
public class PureTokenType extends IElementType
{
    public PureTokenType(@NotNull @NonNls String debugName)
    {
        super(debugName, PureLanguage.INSTANCE);
    }

    @Override
    public String toString()
    {
        return "PureToken." + super.toString();
    }
}

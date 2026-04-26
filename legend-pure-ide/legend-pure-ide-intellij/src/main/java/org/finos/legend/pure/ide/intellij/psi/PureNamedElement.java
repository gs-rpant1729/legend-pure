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

import com.intellij.psi.PsiNameIdentifierOwner;

/**
 * Marker interface for Pure PSI elements that have a name (and optionally a
 * fully-qualified package path).
 * <p>
 * Implemented by all top-level Pure definitions:
 * <ul>
 *   <li>Class definitions</li>
 *   <li>Function definitions</li>
 *   <li>Association definitions</li>
 *   <li>Enumeration definitions</li>
 *   <li>Profile definitions</li>
 * </ul>
 * <p>
 * This enables IntelliJ's rename, find-usages, and go-to-symbol features.
 */
public interface PureNamedElement extends PsiNameIdentifierOwner
{
    /**
     * Returns the simple name of this element (e.g., "MyClass").
     */
    String getName();

    /**
     * Returns the qualified package path of this element (e.g., "my::package").
     * May return null if the element has no explicit package.
     */
    String getPackagePath();

    /**
     * Returns the fully qualified name (e.g., "my::package::MyClass").
     * If no package is declared, returns the simple name.
     */
    default String getQualifiedName()
    {
        String pkg = getPackagePath();
        String name = getName();
        if (pkg != null && !pkg.isEmpty() && name != null)
        {
            return pkg + "::" + name;
        }
        return name;
    }
}

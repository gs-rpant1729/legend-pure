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

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * Icons used throughout the Pure language plugin.
 */
public final class PureIcons
{
    public static final Icon FILE = IconLoader.getIcon("/icons/pure_file.svg", PureIcons.class);
    public static final Icon CLASS = IconLoader.getIcon("/icons/pure_class.svg", PureIcons.class);
    public static final Icon FUNCTION = IconLoader.getIcon("/icons/pure_function.svg", PureIcons.class);
    public static final Icon ENUM = IconLoader.getIcon("/icons/pure_enum.svg", PureIcons.class);
    public static final Icon PROPERTY = IconLoader.getIcon("/icons/pure_property.svg", PureIcons.class);
    public static final Icon ASSOCIATION = IconLoader.getIcon("/icons/pure_association.svg", PureIcons.class);

    private PureIcons()
    {
        // utility class
    }
}

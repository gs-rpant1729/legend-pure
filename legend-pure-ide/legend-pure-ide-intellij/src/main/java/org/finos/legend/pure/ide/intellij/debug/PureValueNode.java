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

package org.finos.legend.pure.ide.intellij.debug;

import com.intellij.openapi.project.Project;
import com.intellij.xdebugger.frame.XCompositeNode;
import com.intellij.xdebugger.frame.XNamedValue;
import com.intellij.xdebugger.frame.XValueChildrenList;
import com.intellij.xdebugger.frame.XValueNode;
import com.intellij.xdebugger.frame.XValuePlace;
import org.finos.legend.pure.ide.intellij.PureIcons;
import org.finos.legend.pure.m3.navigation.Instance;
import org.finos.legend.pure.m3.navigation.M3Properties;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Renders a Pure value (CoreInstance) in the debugger Variables panel.
 * <p>
 * For primitive types (String, Integer, Boolean, Float, Decimal, Date),
 * shows the value directly. For complex types (Class instances), shows
 * the type name and expands to show properties as child nodes.
 */
public class PureValueNode extends XNamedValue
{
    private final CoreInstance value;
    private final Project project;

    public PureValueNode(@NotNull String name, @NotNull CoreInstance value, @NotNull Project project)
    {
        super(name);
        this.value = value;
        this.project = project;
    }

    @Override
    public void computePresentation(@NotNull XValueNode node, @NotNull XValuePlace place)
    {
        String typeName = getTypeName(value);
        String displayValue = getDisplayValue(value);
        Icon icon = getIconForType(typeName);

        boolean hasChildren = hasChildProperties(value);
        node.setPresentation(icon, typeName, displayValue, hasChildren);
    }

    @Override
    public void computeChildren(@NotNull XCompositeNode node)
    {
        // For complex types, show property values as children
        XValueChildrenList children = new XValueChildrenList();

        // Get the instance's properties via 'values' meta-property
        for (String propertyName : value.getKeys())
        {
            if (M3Properties.classifierGenericType.equals(propertyName) ||
                    M3Properties.genericType.equals(propertyName) ||
                    M3Properties.elementOverride.equals(propertyName))
            {
                // Skip internal meta-properties
                continue;
            }

            for (CoreInstance propValue : value.getValueForMetaPropertyToMany(propertyName))
            {
                children.add(new PureValueNode(propertyName, propValue, project));
            }
        }

        node.addChildren(children, true);
    }

    private static String getTypeName(CoreInstance instance)
    {
        CoreInstance classifier = instance.getClassifier();
        if (classifier != null)
        {
            String name = classifier.getName();
            return name != null ? name : "Unknown";
        }
        return "Unknown";
    }

    private static String getDisplayValue(CoreInstance instance)
    {
        // Try to get the primitive value via 'values' property
        CoreInstance values = instance.getValueForMetaPropertyToOne(M3Properties.values);
        if (values != null)
        {
            String name = values.getName();
            return name != null ? name : instance.toString();
        }

        // For non-primitive instances, show the name or a brief summary
        String name = instance.getName();
        if (name != null && !name.isEmpty())
        {
            return name;
        }
        return instance.toString();
    }

    private static boolean hasChildProperties(CoreInstance instance)
    {
        // Check if this instance has meaningful properties that can be expanded
        for (String key : instance.getKeys())
        {
            if (!M3Properties.classifierGenericType.equals(key) &&
                    !M3Properties.genericType.equals(key) &&
                    !M3Properties.elementOverride.equals(key))
            {
                if (instance.getValueForMetaPropertyToMany(key).notEmpty())
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static Icon getIconForType(String typeName)
    {
        if (typeName == null)
        {
            return PureIcons.FILE;
        }
        switch (typeName)
        {
            case "String":
            case "Integer":
            case "Float":
            case "Decimal":
            case "Boolean":
            case "Date":
            case "StrictDate":
            case "DateTime":
                return PureIcons.PROPERTY;
            default:
                return PureIcons.CLASS;
        }
    }
}

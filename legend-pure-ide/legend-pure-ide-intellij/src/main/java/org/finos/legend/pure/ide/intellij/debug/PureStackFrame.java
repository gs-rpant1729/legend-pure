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
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.ColoredTextContainer;
import com.intellij.ui.SimpleTextAttributes;
import com.intellij.xdebugger.XDebuggerUtil;
import com.intellij.xdebugger.XSourcePosition;
import com.intellij.xdebugger.frame.XCompositeNode;
import com.intellij.xdebugger.frame.XStackFrame;
import com.intellij.xdebugger.frame.XValueChildrenList;
import org.finos.legend.pure.ide.intellij.PureIcons;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.runtime.java.interpreted.VariableContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a single stack frame in the Pure debugger.
 * <p>
 * Displays the function name and source location in the call stack panel.
 * When selected, populates the Variables panel by reading variable bindings
 * from the captured {@link VariableContext}.
 */
public class PureStackFrame extends XStackFrame
{
    private final Project project;
    private final String functionName;
    private final SourceInformation sourceInfo;
    private final VariableContext variableContext;
    private final XSourcePosition sourcePosition;

    public PureStackFrame(@NotNull Project project,
                          @NotNull String functionName,
                          @Nullable SourceInformation sourceInfo,
                          @Nullable VariableContext variableContext)
    {
        this.project = project;
        this.functionName = functionName;
        this.sourceInfo = sourceInfo;
        this.variableContext = variableContext;
        this.sourcePosition = resolveSourcePosition(sourceInfo);
    }

    @Override
    public @Nullable XSourcePosition getSourcePosition()
    {
        return sourcePosition;
    }

    @Override
    public void customizePresentation(@NotNull ColoredTextContainer component)
    {
        component.append(functionName, SimpleTextAttributes.REGULAR_ATTRIBUTES);
        if (sourceInfo != null)
        {
            String location = " (" + sourceInfo.getSourceId() + ":" + sourceInfo.getLine() + ")";
            component.append(location, SimpleTextAttributes.GRAYED_ATTRIBUTES);
        }
        component.setIcon(PureIcons.FUNCTION);
    }

    @Override
    public void computeChildren(@NotNull XCompositeNode node)
    {
        if (variableContext == null)
        {
            node.addChildren(XValueChildrenList.EMPTY, true);
            return;
        }

        XValueChildrenList children = new XValueChildrenList();

        // Walk the variable context chain to collect all variables
        VariableContext ctx = variableContext;
        while (ctx != null)
        {
            for (String varName : ctx.getLocalVariableNames())
            {
                CoreInstance value = ctx.getValue(varName);
                if (value != null)
                {
                    children.add(new PureValueNode(varName, value, project));
                }
            }
            ctx = ctx.getParent();
        }

        node.addChildren(children, true);
    }

    private @Nullable XSourcePosition resolveSourcePosition(@Nullable SourceInformation si)
    {
        if (si == null)
        {
            return null;
        }

        // Map sourceId to VirtualFile
        // SourceId is a path like "/platform/pure/m3.pure" or "platform/pure/m3.pure"
        VirtualFile file = LocalFileSystem.getInstance().findFileByPath(si.getSourceId());
        if (file == null)
        {
            // Try project-relative lookup
            // TODO: More robust source mapping via PureProjectService
            return null;
        }

        // Lines are 1-indexed in SourceInformation, 0-indexed in IntelliJ
        return XDebuggerUtil.getInstance().createPosition(file, si.getLine() - 1);
    }
}

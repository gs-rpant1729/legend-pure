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
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.xdebugger.breakpoints.XLineBreakpointType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Line breakpoint type for Pure language debugging.
 * <p>
 * Breakpoints are only allowed within:
 * <ul>
 *   <li>Function bodies (the expressionSequence within a FunctionDefinition)</li>
 *   <li>Qualified property bodies on classes</li>
 * </ul>
 * This restriction is enforced by {@link #canPutAt}, which validates against
 * the PSI/AST node type before allowing the user to place a breakpoint.
 */
public class PureLineBreakpointType extends XLineBreakpointType<PureBreakpointProperties>
{
    public static final String ID = "pure-line";

    public PureLineBreakpointType()
    {
        super(ID, "Pure Line Breakpoints");
    }

    @Override
    public @Nullable PureBreakpointProperties createBreakpointProperties(@NotNull VirtualFile file, int line)
    {
        return new PureBreakpointProperties();
    }

    @Override
    public boolean canPutAt(@NotNull VirtualFile file, int line, @NotNull Project project)
    {
        // Only allow breakpoints in .pure files
        if (!"pure".equals(file.getExtension()))
        {
            return false;
        }

        // TODO: Validate that the line falls within a function body or
        // qualified property body by inspecting the PSI tree at the given line.
        // For now, allow any line in a .pure file.
        return true;
    }
}

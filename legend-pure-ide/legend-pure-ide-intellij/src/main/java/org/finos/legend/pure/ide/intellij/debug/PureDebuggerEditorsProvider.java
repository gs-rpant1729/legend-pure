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

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.xdebugger.XSourcePosition;
import com.intellij.xdebugger.evaluation.EvaluationMode;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import org.finos.legend.pure.ide.intellij.PureFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Editors provider for the Pure debugger, used for expression evaluation
 * in the debug console.
 */
public class PureDebuggerEditorsProvider extends XDebuggerEditorsProvider
{
    @Override
    public @NotNull FileType getFileType()
    {
        return PureFileType.INSTANCE;
    }

    @Override
    public @NotNull com.intellij.openapi.editor.Document createDocument(@NotNull Project project,
                                                                         @NotNull String text,
                                                                         @Nullable XSourcePosition sourcePosition,
                                                                         @NotNull EvaluationMode mode)
    {
        return com.intellij.openapi.editor.EditorFactory.getInstance()
                .createDocument(text);
    }
}

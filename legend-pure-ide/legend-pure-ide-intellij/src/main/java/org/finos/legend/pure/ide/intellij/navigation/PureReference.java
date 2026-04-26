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

package org.finos.legend.pure.ide.intellij.navigation;

import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import org.finos.legend.pure.ide.intellij.service.PureProjectService;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A PsiReference implementation that resolves Pure identifiers to their
 * definitions using the compiled Pure graph.
 * <p>
 * Resolution flow:
 * <ol>
 *   <li>Get the cursor position (line, column) from the PSI element</li>
 *   <li>Call {@code PureProjectService.navigateToDefinition(sourceId, line, column)}
 *       which delegates to {@code Source.navigate()}</li>
 *   <li>Map the resolved CoreInstance's SourceInformation back to a PSI element</li>
 * </ol>
 */
public class PureReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference
{
    private final Project project;

    public PureReference(@NotNull PsiElement element)
    {
        super(element, TextRange.from(0, element.getTextLength()));
        this.project = element.getProject();
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode)
    {
        PsiElement resolved = resolve();
        if (resolved != null)
        {
            return new ResolveResult[]{new PsiElementResolveResult(resolved)};
        }
        return ResolveResult.EMPTY_ARRAY;
    }

    @Override
    public @Nullable PsiElement resolve()
    {
        PureProjectService service = PureProjectService.getInstance(project);
        if (!service.isInitialized())
        {
            return null;
        }

        // Get source file path
        PsiFile containingFile = myElement.getContainingFile();
        if (containingFile == null || containingFile.getVirtualFile() == null)
        {
            return null;
        }

        String sourceId = containingFile.getVirtualFile().getPath();

        // Calculate line and column (1-indexed) from the PSI element offset
        Document document = FileDocumentManager.getInstance().getDocument(containingFile.getVirtualFile());
        if (document == null)
        {
            return null;
        }

        int offset = myElement.getTextOffset();
        int line = document.getLineNumber(offset) + 1; // 1-indexed
        int column = offset - document.getLineStartOffset(line - 1) + 1; // 1-indexed

        // Navigate to definition using the compiled graph
        CoreInstance target = service.navigateToDefinition(sourceId, line, column);
        if (target == null)
        {
            return null;
        }

        // Map the target CoreInstance's SourceInformation to a PsiElement
        SourceInformation targetSourceInfo = target.getSourceInformation();
        if (targetSourceInfo == null)
        {
            return null;
        }

        return findPsiElement(targetSourceInfo);
    }

    /**
     * Maps SourceInformation (sourceId + line + column) to a PsiElement
     * so IntelliJ can navigate to the target.
     */
    @Nullable
    private PsiElement findPsiElement(@NotNull SourceInformation sourceInfo)
    {
        // Find the target file
        VirtualFile targetFile = LocalFileSystem.getInstance().findFileByPath(sourceInfo.getSourceId());
        if (targetFile == null)
        {
            return null;
        }

        PsiManager psiManager = PsiManager.getInstance(project);
        PsiFile targetPsiFile = psiManager.findFile(targetFile);
        if (targetPsiFile == null)
        {
            return null;
        }

        // Convert line/column to offset
        Document targetDocument = FileDocumentManager.getInstance().getDocument(targetFile);
        if (targetDocument == null)
        {
            return null;
        }

        int targetLine = Math.max(0, sourceInfo.getStartLine() - 1); // 0-indexed
        if (targetLine >= targetDocument.getLineCount())
        {
            return null;
        }

        int targetColumn = Math.max(0, sourceInfo.getStartColumn() - 1); // 0-indexed
        int targetOffset = targetDocument.getLineStartOffset(targetLine) + targetColumn;

        if (targetOffset >= targetDocument.getTextLength())
        {
            return null;
        }

        // Find the PSI element at that offset
        PsiElement elementAtOffset = targetPsiFile.findElementAt(targetOffset);
        return elementAtOffset != null ? elementAtOffset : targetPsiFile;
    }

    @Override
    public Object @NotNull [] getVariants()
    {
        // Variants are handled by PureCompletionContributor
        return EMPTY_ARRAY;
    }
}

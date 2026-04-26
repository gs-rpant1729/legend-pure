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

package org.finos.legend.pure.ide.intellij.annotator;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.ExternalAnnotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiFile;
import org.finos.legend.pure.ide.intellij.service.PureProjectService;
import org.finos.legend.pure.m3.exception.PureExecutionException;
import org.finos.legend.pure.m3.serialization.runtime.PureRuntime;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.m4.exception.PureException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * External annotator that compiles Pure source files in the background
 * and reports any parse or compilation errors as editor annotations.
 * <p>
 * The annotator uses a three-phase model:
 * <ol>
 *   <li><b>collectInformation</b>: captures the file path and current content</li>
 *   <li><b>doAnnotate</b>: submits the content for compilation and collects errors</li>
 *   <li><b>apply</b>: maps errors to editor annotations with source positions</li>
 * </ol>
 */
public class PureExternalAnnotator extends ExternalAnnotator<PureExternalAnnotator.CollectedInfo, List<PureExternalAnnotator.PureError>>
{

    @Override
    public @Nullable CollectedInfo collectInformation(@NotNull PsiFile file)
    {
        if (file.getVirtualFile() == null)
        {
            return null;
        }

        String sourceId = file.getVirtualFile().getPath();
        String content = file.getText();
        return new CollectedInfo(sourceId, content, file);
    }

    @Override
    public @Nullable List<PureError> doAnnotate(@NotNull CollectedInfo info)
    {
        PureProjectService service = PureProjectService.getInstance(info.psiFile.getProject());
        if (!service.isInitialized())
        {
            return Collections.emptyList();
        }

        PureRuntime runtime = service.getRuntime();
        if (runtime == null)
        {
            return Collections.emptyList();
        }

        List<PureError> errors = new ArrayList<>();
        try
        {
            // Modify the source and attempt compilation
            runtime.modify(info.sourceId, info.content);
            runtime.compile();
        }
        catch (PureException e)
        {
            // Capture compilation/parse errors with source positions
            SourceInformation si = e.getOriginatingPureException() != null ?
                    e.getOriginatingPureException().getSourceInformation() :
                    e.getSourceInformation();

            String message = e.getOriginatingPureException() != null ?
                    e.getOriginatingPureException().getInfo() :
                    e.getInfo();

            if (message == null)
            {
                message = e.getMessage();
            }

            errors.add(new PureError(
                    message != null ? message : "Compilation error",
                    si,
                    info.sourceId
            ));
        }
        catch (Exception e)
        {
            // Catch-all for unexpected errors
            errors.add(new PureError(
                    e.getMessage() != null ? e.getMessage() : "Unknown compilation error",
                    null,
                    info.sourceId
            ));
        }

        return errors;
    }

    @Override
    public void apply(@NotNull PsiFile file,
                      @NotNull List<PureError> errors,
                      @NotNull AnnotationHolder holder)
    {
        if (errors.isEmpty())
        {
            return;
        }

        Document document = FileDocumentManager.getInstance().getDocument(file.getVirtualFile());
        if (document == null)
        {
            return;
        }

        for (PureError error : errors)
        {
            // Only show errors from this file
            if (error.sourceInfo != null &&
                    !error.sourceId.equals(error.sourceInfo.getSourceId()))
            {
                continue;
            }

            TextRange range;
            if (error.sourceInfo != null)
            {
                int startLine = Math.max(0, error.sourceInfo.getStartLine() - 1);
                int endLine = Math.max(0, error.sourceInfo.getEndLine() - 1);

                if (startLine < document.getLineCount())
                {
                    int startCol = Math.max(0, error.sourceInfo.getStartColumn() - 1);
                    int startOffset = document.getLineStartOffset(startLine) + startCol;

                    int endOffset;
                    if (endLine < document.getLineCount())
                    {
                        int endCol = Math.max(0, error.sourceInfo.getEndColumn());
                        endOffset = Math.min(
                                document.getLineStartOffset(endLine) + endCol,
                                document.getTextLength()
                        );
                    }
                    else
                    {
                        endOffset = Math.min(
                                document.getLineEndOffset(startLine),
                                document.getTextLength()
                        );
                    }

                    startOffset = Math.min(startOffset, document.getTextLength());
                    endOffset = Math.min(endOffset, document.getTextLength());

                    if (startOffset >= endOffset)
                    {
                        // Fall back to the whole line
                        startOffset = document.getLineStartOffset(startLine);
                        endOffset = document.getLineEndOffset(startLine);
                    }

                    range = new TextRange(startOffset, endOffset);
                }
                else
                {
                    range = new TextRange(0, Math.min(1, document.getTextLength()));
                }
            }
            else
            {
                // No source position — underline the first line
                range = new TextRange(0, Math.min(document.getLineEndOffset(0), document.getTextLength()));
            }

            holder.newAnnotation(HighlightSeverity.ERROR, error.message)
                    .range(range)
                    .create();
        }
    }

    static class CollectedInfo
    {
        final String sourceId;
        final String content;
        final PsiFile psiFile;

        CollectedInfo(String sourceId, String content, PsiFile psiFile)
        {
            this.sourceId = sourceId;
            this.content = content;
            this.psiFile = psiFile;
        }
    }

    static class PureError
    {
        final String message;
        final SourceInformation sourceInfo;
        final String sourceId;

        PureError(String message, SourceInformation sourceInfo, String sourceId)
        {
            this.message = message;
            this.sourceInfo = sourceInfo;
            this.sourceId = sourceId;
        }
    }
}

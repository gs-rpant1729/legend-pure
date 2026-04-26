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

package org.finos.legend.pure.ide.intellij.service;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.VFileContentChangeEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileCreateEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileDeleteEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Listens for VFS (Virtual File System) changes on {@code .pure} files
 * and triggers incremental recompilation via the {@link PureProjectService}.
 * <p>
 * This listener is registered via the plugin.xml message bus and ensures
 * that the Pure runtime stays in sync with editor changes, providing
 * real-time compilation feedback as the user types.
 */
public class PureVfsListener implements BulkFileListener
{
    private final Project project;

    public PureVfsListener(@NotNull Project project)
    {
        this.project = project;
    }

    @Override
    public void after(@NotNull List<? extends VFileEvent> events)
    {
        PureProjectService service = PureProjectService.getInstance(project);
        if (!service.isInitialized())
        {
            return;
        }

        for (VFileEvent event : events)
        {
            if (event.getFile() == null || !"pure".equals(event.getFile().getExtension()))
            {
                continue;
            }

            if (event instanceof VFileContentChangeEvent)
            {
                // File content changed — trigger incremental recompilation
                String sourceId = event.getFile().getPath();
                try
                {
                    String content = new String(event.getFile().contentsToByteArray());
                    service.onSourceModified(sourceId, content);
                }
                catch (Exception e)
                {
                    // Log and continue — don't crash the VFS listener
                    com.intellij.openapi.diagnostic.Logger.getInstance(PureVfsListener.class)
                            .warn("Failed to process Pure file change: " + sourceId, e);
                }
            }
            else if (event instanceof VFileCreateEvent)
            {
                // New Pure file created — add to runtime and compile
                String sourceId = event.getFile().getPath();
                try
                {
                    String content = new String(event.getFile().contentsToByteArray());
                    service.onSourceCreated(sourceId, content);
                }
                catch (Exception e)
                {
                    com.intellij.openapi.diagnostic.Logger.getInstance(PureVfsListener.class)
                            .warn("Failed to process Pure file creation: " + sourceId, e);
                }
            }
            else if (event instanceof VFileDeleteEvent)
            {
                // Pure file deleted — remove from runtime
                String sourceId = event.getFile().getPath();
                try
                {
                    service.onSourceDeleted(sourceId);
                }
                catch (Exception e)
                {
                    com.intellij.openapi.diagnostic.Logger.getInstance(PureVfsListener.class)
                            .warn("Failed to process Pure file deletion: " + sourceId, e);
                }
            }
        }
    }
}

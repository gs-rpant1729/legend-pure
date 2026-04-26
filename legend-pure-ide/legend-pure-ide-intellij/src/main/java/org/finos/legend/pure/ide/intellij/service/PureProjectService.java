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

import com.intellij.openapi.Disposable;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.factory.Maps;
import org.eclipse.collections.api.factory.Sets;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.set.MutableSet;
import org.finos.legend.pure.m3.navigation.ProcessorSupport;
import org.finos.legend.pure.m3.serialization.filesystem.repository.CodeRepository;
import org.finos.legend.pure.m3.serialization.filesystem.repository.CodeRepositoryProviderHelper;
import org.finos.legend.pure.m3.serialization.filesystem.repository.CodeRepositorySet;
import org.finos.legend.pure.m3.serialization.filesystem.repository.GenericCodeRepository;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.MutableRepositoryCodeStorage;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.RepositoryCodeStorage;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.classpath.ClassLoaderCodeStorage;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.composite.CompositeCodeStorage;
import org.finos.legend.pure.m3.serialization.filesystem.usercodestorage.fs.MutableFSCodeStorage;
import org.finos.legend.pure.m3.serialization.runtime.Message;
import org.finos.legend.pure.m3.serialization.runtime.PureRuntime;
import org.finos.legend.pure.m3.serialization.runtime.PureRuntimeBuilder;
import org.finos.legend.pure.m3.serialization.runtime.Source;
import org.finos.legend.pure.m4.ModelRepository;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;
import org.finos.legend.pure.runtime.java.interpreted.FunctionExecutionInterpreted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.eclipse.collections.impl.tuple.Tuples;

/**
 * IntelliJ Project Service that manages a {@link PureRuntime} instance per project.
 * <p>
 * This is an always-on background service that:
 * <ul>
 *   <li>Initializes the PureRuntime on first use using project source roots</li>
 *   <li>Provides the PureRuntime, ProcessorSupport, and ModelRepository to other plugin components</li>
 *   <li>Supports incremental source modification and element resolution</li>
 * </ul>
 */
public class PureProjectService implements Disposable
{
    private static final Logger LOG = Logger.getInstance(PureProjectService.class);

    private final Project project;
    private volatile PureRuntime runtime;
    private volatile boolean initialized = false;
    private volatile boolean initializing = false;

    public PureProjectService(@NotNull Project project)
    {
        this.project = project;
    }

    public static PureProjectService getInstance(@NotNull Project project)
    {
        return project.getService(PureProjectService.class);
    }

    /**
     * Initialize the PureRuntime in the background.
     * Uses project source roots to build the code storage.
     */
    public synchronized void initialize()
    {
        if (initialized || initializing)
        {
            return;
        }
        initializing = true;

        ProgressManager.getInstance().run(new Task.Backgroundable(project, "Initializing Pure Runtime", true)
        {
            @Override
            public void run(@NotNull ProgressIndicator indicator)
            {
                try
                {
                    indicator.setText("Building Pure code storage...");
                    MutableRepositoryCodeStorage codeStorage = buildCodeStorage();

                    indicator.setText("Compiling Pure sources...");
                    Message message = new Message("")
                    {
                        @Override
                        public void setMessage(String message)
                        {
                            indicator.setText2(message);
                        }
                    };

                    runtime = new PureRuntimeBuilder(codeStorage)
                            .withMessage(message)
                            .setTransactionalByDefault(false)
                            .buildAndInitialize(message);

                    loadWelcomePure(runtime, indicator);

                    initialized = true;
                    LOG.info("Pure runtime initialized successfully");
                }
                catch (Exception e)
                {
                    LOG.error("Failed to initialize Pure runtime", e);
                }
                finally
                {
                    initializing = false;
                }
            }
        });
    }

    /**
     * Build composite code storage by merging all classpath repositories with any
     * {@code *.definition.json}-backed FS repositories discovered in the project tree.
     */
    private MutableRepositoryCodeStorage buildCodeStorage()
    {
        return new CompositeCodeStorage(getRepositories(null));
    }

    /**
     * If {@code welcome.pure} exists at the project base directory, loads and compiles it
     * into the runtime as an in-memory source so its {@code go()} function is available.
     */
    private void loadWelcomePure(PureRuntime pureRuntime, ProgressIndicator indicator)
    {
        String basePath = project.getBasePath();
        if (basePath == null)
        {
            return;
        }

        Path welcomePath = Paths.get(basePath, "welcome.pure");
        if (!Files.exists(welcomePath))
        {
            return;
        }

        try
        {
            indicator.setText("Loading welcome.pure...");
            String content = Files.readString(welcomePath);
            pureRuntime.createInMemoryAndCompile(Tuples.pair("welcome.pure", content));
            LOG.info("Loaded and compiled welcome.pure from " + welcomePath);
        }
        catch (IOException e)
        {
            LOG.error("Could not read welcome.pure: " + e.getMessage());
        }
        catch (Exception e)
        {
            LOG.error("Could not compile welcome.pure: " + e.getMessage());
        }
    }

    @Nullable
    public PureRuntime getRuntime()
    {
        if (!initialized && !initializing)
        {
            initialize();
        }
        return runtime;
    }

    @Nullable
    public ProcessorSupport getProcessorSupport()
    {
        PureRuntime rt = getRuntime();
        return rt != null ? rt.getProcessorSupport() : null;
    }

    @Nullable
    public ModelRepository getModelRepository()
    {
        PureRuntime rt = getRuntime();
        return rt != null ? rt.getModelRepository() : null;
    }

    /**
     * Resolve a qualified path (e.g., "meta::pure::metamodel::type::Class")
     * to a CoreInstance from the compiled graph.
     */
    @Nullable
    public CoreInstance getCoreInstance(@NotNull String qualifiedPath)
    {
        PureRuntime rt = getRuntime();
        return rt != null ? rt.getCoreInstance(qualifiedPath) : null;
    }

    /**
     * Navigate to the definition at the given position in a source file.
     * Uses {@link Source#navigate(int, int, ProcessorSupport)}.
     *
     * @param sourceId source file path
     * @param line     1-indexed line number
     * @param column   1-indexed column number
     * @return the target CoreInstance, or null if not found
     */
    @Nullable
    public CoreInstance navigateToDefinition(@NotNull String sourceId, int line, int column)
    {
        PureRuntime rt = getRuntime();
        String sourceId1 = sourceId.endsWith("welcome.pure") ? "welcome.pure" : sourceId;

        if (rt == null)
        {
            return null;
        }

        Source source = rt.getSourceById(sourceId1);
        if (source == null)
        {
            return null;
        }

        return source.navigate(line, column, rt.getProcessorSupport());
    }

    /**
     * Add a newly created Pure source file to the runtime and compile it.
     */
    public void onSourceCreated(@NotNull String sourceId, @NotNull String content)
    {
        PureRuntime rt = getRuntime();
        if (rt != null)
        {
            try
            {
                rt.createInMemoryAndCompile(Tuples.pair(sourceId, content));
            }
            catch (Exception e)
            {
                LOG.debug("Compilation error after source creation", e);
            }
        }
    }

    /**
     * Remove a deleted Pure source file from the runtime.
     */
    public void onSourceDeleted(@NotNull String sourceId)
    {
        PureRuntime rt = getRuntime();
        if (rt != null)
        {
            try
            {
                rt.delete(sourceId);
            }
            catch (Exception e)
            {
                LOG.debug("Error removing deleted source from runtime", e);
            }
        }
    }

    /**
     * Modify a source file's content, triggering incremental recompilation.
     */
    public void onSourceModified(@NotNull String sourceId, @NotNull String content)
    {
        PureRuntime rt = getRuntime();
        String source = sourceId.endsWith("welcome.pure") ? "welcome.pure" : sourceId;
        if (rt != null)
        {
            try
            {
                rt.modify(source, content);
                rt.compile();
            }
            catch (Exception e)
            {
                // Expected during editing — compilation errors are propagated
                // via the PureExternalAnnotator
                LOG.debug("Compilation error after source modification", e);
            }
        }
    }

    public boolean isInitialized()
    {
        return initialized && runtime != null;
    }

    @Override
    public void dispose()
    {
        runtime = null;
        initialized = false;
    }

    private MutableList<RepositoryCodeStorage> getRepositories(List<String> requiredRepositories)
    {
        Map<CodeRepository, RepositoryCodeStorage> repoToCodeStorageMap = Maps.mutable.empty();
        repoToCodeStorageMap.putAll(CodeRepositoryProviderHelper.findCodeRepositories().toMap(r -> r, ClassLoaderCodeStorage::new));
        repoToCodeStorageMap.putAll(this.buildRepositories().toMap(cs -> cs.getAllRepositories().getOnly(), cs -> cs));

        CodeRepositorySet codeRepositorySet = CodeRepositorySet.newBuilder().withCodeRepositories(repoToCodeStorageMap.keySet()).build();

        if (requiredRepositories != null)
        {
            MutableSet<String> requiredSet = Sets.mutable.withAll(requiredRepositories);
            codeRepositorySet = codeRepositorySet.subset(requiredSet);
        }

        return codeRepositorySet.getRepositories().collect(repoToCodeStorageMap::get, Lists.mutable.ofInitialCapacity(codeRepositorySet.size()));
    }

    /**
     * Walks the project file tree and builds a {@link MutableFSCodeStorage} for every
     * {@code *.definition.json} file whose sibling source directory exists.
     * <p>
     * Convention: a file {@code resources/foo.definition.json} must have a
     * companion directory {@code resources/foo/} containing the Pure sources.
     */
    protected MutableList<RepositoryCodeStorage> buildRepositories()
    {
        String basePath = project.getBasePath();
        if (basePath == null)
        {
            return Lists.mutable.empty();
        }

        MutableList<RepositoryCodeStorage> repositories = Lists.mutable.empty();
        try (java.util.stream.Stream<Path> stream = Files.walk(Paths.get(basePath)))
        {
            stream.filter(p -> p.getFileName().toString().endsWith(".definition.json"))
                    .forEach(definitionJson ->
                    {
                        try
                        {
                            MutableFSCodeStorage storage = buildCodeStorageFromDefinition(definitionJson);
                            if (storage != null)
                            {
                                repositories.add(storage);
                                LOG.info("Discovered Pure repository from " + definitionJson);
                            }
                        }
                        catch (Exception e)
                        {
                            LOG.warn("Skipping " + definitionJson + ": " + e.getMessage());
                        }
                    });
        }
        catch (IOException e)
        {
            LOG.warn("Could not walk project tree to discover definition.json files: " + e.getMessage());
        }

        return repositories;
    }

    /**
     * Builds a {@link MutableFSCodeStorage} from a {@code *.definition.json} file.
     * The Pure source directory is expected at {@code definitionJson.parent / stem}.
     * Returns {@code null} if the source directory does not exist.
     */
    private static MutableFSCodeStorage buildCodeStorageFromDefinition(Path definitionJson)
    {
        String filename = definitionJson.getFileName().toString();
        String stem = filename.substring(0, filename.length() - ".definition.json".length());
        Path sourceDir = definitionJson.getParent().resolve(stem);

        if (!Files.isDirectory(sourceDir))
        {
            return null;
        }

        GenericCodeRepository repository = GenericCodeRepository.build(definitionJson);
        return new MutableFSCodeStorage(
                GenericCodeRepository.build(repository.getName(), repository.getAllowedPackagesPattern()),
                sourceDir
        );
    }
}

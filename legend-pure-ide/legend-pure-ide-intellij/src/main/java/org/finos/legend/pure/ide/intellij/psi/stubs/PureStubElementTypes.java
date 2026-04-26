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

package org.finos.legend.pure.ide.intellij.psi.stubs;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.*;
import org.finos.legend.pure.ide.intellij.PureLanguage;
import org.finos.legend.pure.ide.intellij.psi.PureDefinitionElement;
import org.finos.legend.pure.ide.intellij.psi.PureDefinitionStub;
import org.finos.legend.pure.ide.intellij.psi.PureDefinitionStubImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Defines the {@link IStubElementType} instances for each Pure definition kind.
 * <p>
 * Each definition type (Class, Function, Enum, Association, Profile) gets its
 * own IStubElementType so that the stub serializer can distinguish them and
 * create the correct composite element during deserialization.
 */
public final class PureStubElementTypes
{
    public static final PureDefinitionStubElementType CLASS =
            new PureDefinitionStubElementType("CLASS_DEFINITION", "Class");
    public static final PureDefinitionStubElementType FUNCTION =
            new PureDefinitionStubElementType("FUNCTION_DEFINITION", "Function");
    public static final PureDefinitionStubElementType ENUM =
            new PureDefinitionStubElementType("ENUM_DEFINITION", "Enum");
    public static final PureDefinitionStubElementType ASSOCIATION =
            new PureDefinitionStubElementType("ASSOCIATION_DEFINITION", "Association");
    public static final PureDefinitionStubElementType PROFILE =
            new PureDefinitionStubElementType("PROFILE_DEFINITION", "Profile");


    private static final Map<String, PureDefinitionStubElementType> KIND_MAP = new HashMap<>();

    static
    {
        KIND_MAP.put("Class", CLASS);
        KIND_MAP.put("Function", FUNCTION);
        KIND_MAP.put("Enum", ENUM);
        KIND_MAP.put("Association", ASSOCIATION);
        KIND_MAP.put("Profile", PROFILE);
    }

    public static PureDefinitionStubElementType getTypeForKind(String kind)
    {
        PureDefinitionStubElementType type = KIND_MAP.get(kind);
        return type != null ? type : CLASS; // fallback
    }

    private PureStubElementTypes()
    {
        // utility class
    }

    /**
     * Stub element type for Pure definitions.
     * Handles serialization/deserialization and index key generation.
     */
    public static class PureDefinitionStubElementType
            extends IStubElementType<PureDefinitionStub, PureDefinitionElement>
    {
        private final String definitionKind;

        PureDefinitionStubElementType(String debugName, String definitionKind)
        {
            super(debugName, PureLanguage.INSTANCE);
            this.definitionKind = definitionKind;
        }

        public String getDefinitionKind()
        {
            return definitionKind;
        }

        @Override
        public PureDefinitionElement createPsi(@NotNull PureDefinitionStub stub)
        {
            return new PureDefinitionElement(stub, this);
        }

        @Override
        public @NotNull PureDefinitionStub createStub(@NotNull PureDefinitionElement psi, StubElement<?> parentStub)
        {
            return new PureDefinitionStubImpl(
                    parentStub,
                    psi.getName(),
                    psi.getPackagePath(),
                    definitionKind
            );
        }

        @Override
        public @NotNull String getExternalId()
        {
            return "pure." + definitionKind;
        }

        @Override
        public void serialize(@NotNull PureDefinitionStub stub, @NotNull StubOutputStream dataStream) throws IOException
        {
            dataStream.writeName(stub.getName());
            dataStream.writeName(stub.getPackagePath());
            dataStream.writeName(stub.getDefinitionKind());
        }

        @Override
        public @NotNull PureDefinitionStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException
        {
            String name = dataStream.readNameString();
            String packagePath = dataStream.readNameString();
            String kind = dataStream.readNameString();
            return new PureDefinitionStubImpl(parentStub, name, packagePath, kind != null ? kind : definitionKind);
        }

        @Override
        public void indexStub(@NotNull PureDefinitionStub stub, @NotNull IndexSink sink)
        {
            String name = stub.getName();
            if (name != null)
            {
                // Index by simple name
                sink.occurrence(PureDefinitionNameIndex.KEY, name);

                // Index by qualified name
                String packagePath = stub.getPackagePath();
                String qualifiedName = (packagePath != null && !packagePath.isEmpty())
                        ? packagePath + "::" + name
                        : name;
                sink.occurrence(PureDefinitionQualifiedNameIndex.KEY, qualifiedName);
            }
        }

        @Override
        public boolean shouldCreateStub(ASTNode node)
        {
            // Always create stubs for definition nodes
            return true;
        }
    }
}

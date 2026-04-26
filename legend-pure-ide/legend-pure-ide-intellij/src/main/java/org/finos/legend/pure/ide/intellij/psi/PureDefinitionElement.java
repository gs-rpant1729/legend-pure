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

package org.finos.legend.pure.ide.intellij.psi;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;
import org.finos.legend.pure.ide.intellij.parser.PureElementTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * PSI element for top-level Pure definitions (Class, function, Enum, etc.).
 * <p>
 * This is stub-aware: when stubs are available (index not yet invalidated),
 * name and package lookups come from the serialised stub data without
 * parsing the file. Otherwise it falls through to the live AST.
 */
public class PureDefinitionElement extends StubBasedPsiElementBase<PureDefinitionStub> implements PureNamedElement
{
    public PureDefinitionElement(@NotNull ASTNode node)
    {
        super(node);
    }

    public PureDefinitionElement(@NotNull PureDefinitionStub stub, @NotNull IStubElementType<?, ?> nodeType)
    {
        super(stub, nodeType);
    }

    @Override
    public String getName()
    {
        // Prefer stub data
        PureDefinitionStub stub = getGreenStub();
        if (stub != null)
        {
            return stub.getName();
        }

        // Fall through to AST: the name is the first VALID_STRING child
        // after the keyword token
        return extractNameFromAst();
    }

    @Override
    public @Nullable PsiElement getNameIdentifier()
    {
        // Find the first VALID_STRING child, which is the element's name
        ASTNode nameNode = findNameNode();
        return nameNode != null ? nameNode.getPsi() : null;
    }

    @Override
    public PsiElement setName(@NotNull String name)
    {
        // Rename not supported yet — requires creating a new leaf node
        // TODO: Implement via PsiElementFactory if needed
        return this;
    }

    @Override
    public String getPackagePath()
    {
        PureDefinitionStub stub = getGreenStub();
        if (stub != null)
        {
            return stub.getPackagePath();
        }

        return extractPackagePathFromAst();
    }

    /**
     * Returns the definition kind (e.g. "Class", "Function") based
     * on the parent composite element type.
     */
    public String getDefinitionKind()
    {
        PureDefinitionStub stub = getGreenStub();
        if (stub != null)
        {
            return stub.getDefinitionKind();
        }

        IElementType type = getNode().getElementType();
        if (type == PureElementTypes.CLASS_DEFINITION)
        {
            return "Class";
        }
        if (type == PureElementTypes.FUNCTION_DEFINITION)
        {
            return "Function";
        }
        if (type == PureElementTypes.ENUMERATION_DEFINITION)
        {
            return "Enum";
        }
        if (type == PureElementTypes.ASSOCIATION_DEFINITION)
        {
            return "Association";
        }
        if (type == PureElementTypes.PROFILE_DEFINITION)
        {
            return "Profile";
        }
        return "Element";
    }

    // --- Private helpers ---

    /**
     * Find the first VALID_STRING child node in the AST.
     * For definitions like "Class my::package::MyClass { ... }",
     * the first VALID_STRING is part of the qualified name path.
     */
    @Nullable
    private ASTNode findNameNode()
    {
        // Walk children to find the last VALID_STRING before PATH_SEPARATOR stops
        ASTNode child = getNode().getFirstChildNode();
        ASTNode lastValidString = null;

        while (child != null)
        {
            IElementType childType = child.getElementType();
            if (childType == PureElementTypes.VALID_STRING)
            {
                lastValidString = child;
            }
            else if (childType == PureElementTypes.CURLY_BRACKET_OPEN ||
                    childType == PureElementTypes.GROUP_OPEN ||
                    childType == PureElementTypes.LESSTHAN)
            {
                // Stop before body, params, or type params
                break;
            }
            child = child.getTreeNext();
        }

        return lastValidString;
    }

    @Nullable
    private String extractNameFromAst()
    {
        // Build the full qualified path, then extract the last segment
        String fullPath = extractFullPathFromAst();
        if (fullPath == null)
        {
            return null;
        }
        int lastSep = fullPath.lastIndexOf("::");
        return lastSep >= 0 ? fullPath.substring(lastSep + 2) : fullPath;
    }

    @Nullable
    private String extractPackagePathFromAst()
    {
        String fullPath = extractFullPathFromAst();
        if (fullPath == null)
        {
            return null;
        }
        int lastSep = fullPath.lastIndexOf("::");
        return lastSep >= 0 ? fullPath.substring(0, lastSep) : "";
    }

    /**
     * Extracts the full qualified path from the AST by collecting
     * VALID_STRING and PATH_SEPARATOR tokens before the body.
     */
    @Nullable
    private String extractFullPathFromAst()
    {
        StringBuilder path = new StringBuilder();
        ASTNode child = getNode().getFirstChildNode();
        boolean startedPath = false;

        while (child != null)
        {
            IElementType childType = child.getElementType();
            if (childType == PureElementTypes.VALID_STRING)
            {
                path.append(child.getText());
                startedPath = true;
            }
            else if (childType == PureElementTypes.PATH_SEPARATOR && startedPath)
            {
                path.append("::");
            }
            else if (startedPath && childType != PureElementTypes.WHITESPACE)
            {
                // Stop at first non-path token after we started collecting
                break;
            }
            child = child.getTreeNext();
        }

        return path.length() > 0 ? path.toString() : null;
    }

    @Override
    public String toString()
    {
        return getDefinitionKind() + ": " + getName();
    }
}

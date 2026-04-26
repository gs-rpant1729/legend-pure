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

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.finos.legend.pure.ide.intellij.parser.PureElementTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Registers PsiReferenceProviders for Pure identifiers (type references,
 * function calls, property accesses).
 * <p>
 * Go-to definition flow:
 * <ol>
 *   <li>Get the PSI element at cursor (VALID_STRING token)</li>
 *   <li>Create a {@link PureReference} which calls {@code Source.navigate()}</li>
 *   <li>Map the resolved CoreInstance's SourceInformation to a PsiElement</li>
 * </ol>
 */
public class PureReferenceContributor extends PsiReferenceContributor
{
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar)
    {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement().withElementType(PureElementTypes.VALID_STRING),
                new PsiReferenceProvider()
                {
                    @Override
                    public PsiReference @NotNull [] getReferencesByElement(@NotNull PsiElement element,
                                                                          @NotNull ProcessingContext context)
                    {
                        return new PsiReference[]{new PureReference(element)};
                    }
                }
        );
    }
}

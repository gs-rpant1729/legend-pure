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

package org.finos.legend.pure.runtime.java.interpreted;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.stack.MutableStack;
import org.finos.legend.pure.m3.coreinstance.meta.pure.metamodel.function.Function;
import org.finos.legend.pure.m3.exception.PureExecutionException;
import org.finos.legend.pure.m4.coreinstance.CoreInstance;
import org.finos.legend.pure.m4.coreinstance.SourceInformation;

/**
 * Listener interface for the Pure interpreted debugger.
 * <p>
 * Implementations of this interface can be attached to a
 * {@link FunctionExecutionInterpreted}
 * to receive callbacks at key points during Pure execution. The debugger uses
 * these
 * callbacks to implement breakpoints, stepping, and variable inspection.
 * <p>
 * <b>Execution Model Context:</b>
 * A Pure Function contains an {@code expressionSequence} of 1+
 * {@code ValueSpecification}s.
 * Each top-level ValueSpec roughly corresponds to one line of code. A ValueSpec
 * can be:
 * <ul>
 * <li>{@code FunctionExpression} — a function call (may contain nested
 * ValueSpecs as arguments)</li>
 * <li>{@code VariableExpression} — a variable reference</li>
 * <li>{@code InstanceValue} — a collection of values</li>
 * </ul>
 * A single source line can contain multiple nested ValueSpecifications, so the
 * debugger
 * implementation must track the last stopped line to avoid stopping multiple
 * times
 * on the same source line.
 */
public interface PureDebuggerListener
{
    /**
     * Called before each expression is evaluated.
     * <p>
     * This is the primary hook for the debugger to pause execution when a
     * breakpoint
     * matches the given {@code sourceInfo}. The implementation should compare the
     * source info against registered breakpoints and, if a match is found, block
     * the
     * execution thread (e.g., using a {@code CountDownLatch}) until the user
     * resumes.
     * <p>
     * Since a single source line can produce multiple nested calls to this method
     * (due to nested ValueSpecifications), the implementation must track the last
     * stopped line ({@code sourceId + line}) and only suspend on the first call
     * for a given line.
     *
     * @param expression      the ValueSpecification about to be evaluated
     * @param sourceInfo      source location (file, line, column) of the expression
     * @param variableContext current variable bindings (for variable inspection in
     *                        the debugger UI)
     * @param callStack       the current function call stack (for call stack
     *                        display)
     */
    void onBeforeExpressionEvaluation(CoreInstance expression,
            SourceInformation sourceInfo,
            VariableContext variableContext,
            MutableStack<CoreInstance> callStack);

    /**
     * Called after each expression is evaluated.
     * <p>
     * Used by the debugger to track stepping operations. For "step over", the
     * debugger
     * records the current line and uses this callback to detect when execution has
     * moved past the current expression (to the next line).
     *
     * @param expression the ValueSpecification that was just evaluated
     * @param result     the result of the evaluation
     * @param sourceInfo source location of the expression
     */
    void onAfterExpressionEvaluation(CoreInstance expression,
            CoreInstance result,
            SourceInformation sourceInfo);

    /**
     * Called when entering a function.
     * <p>
     * Used to implement "Step Into" — the debugger increments the call depth
     * counter
     * and may choose to suspend on the first expression inside the function body.
     * Also used to build the call stack frames displayed in the debugger UI.
     *
     * @param function     the function being entered
     * @param params       the actual parameter values passed to the function
     * @param callSiteInfo source location of the call site (where the function was
     *                     called from)
     */
    void onFunctionEnter(Function<?> function,
            ListIterable<? extends CoreInstance> params,
            SourceInformation callSiteInfo);

    /**
     * Called when exiting a function.
     * <p>
     * Used to implement "Step Out" — the debugger decrements the call depth counter
     * and suspends execution when the depth falls below the level where "Step Out"
     * was initiated.
     *
     * @param function the function being exited
     * @param result   the return value of the function
     */
    void onFunctionExit(Function<?> function, CoreInstance result);

    /**
     * Called when a Pure execution exception occurs.
     * <p>
     * Allows the debugger to catch exceptions and suspend execution at the throw
     * site,
     * enabling the user to inspect the state at the point of failure (similar to
     * "break on exception" in traditional debuggers).
     *
     * @param exception the exception that was thrown
     */
    void onException(PureExecutionException exception);
}

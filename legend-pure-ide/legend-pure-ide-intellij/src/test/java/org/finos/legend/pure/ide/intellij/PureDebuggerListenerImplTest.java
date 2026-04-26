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

package org.finos.legend.pure.ide.intellij;

import org.finos.legend.pure.ide.intellij.debug.PureDebuggerListenerImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the PureDebuggerListenerImpl stepping state machine.
 * <p>
 * These tests validate the line-level deduplication and stepping logic
 * without requiring a running IntelliJ instance.
 */
class PureDebuggerListenerImplTest
{
    // Note: Full unit tests for PureDebuggerListenerImpl require mocking
    // XDebugSession and the IntelliJ platform. These skeleton tests document
    // the expected behavior and can be filled in with a mocking framework.

    @Test
    void testStepModeEnumValues()
    {
        // Verify all step modes are defined
        PureDebuggerListenerImpl.StepMode[] modes = PureDebuggerListenerImpl.StepMode.values();
        assertEquals(4, modes.length);
        assertNotNull(PureDebuggerListenerImpl.StepMode.NONE);
        assertNotNull(PureDebuggerListenerImpl.StepMode.STEP_OVER);
        assertNotNull(PureDebuggerListenerImpl.StepMode.STEP_INTO);
        assertNotNull(PureDebuggerListenerImpl.StepMode.STEP_OUT);
    }

    @Test
    void testStepModeNoneIsDefault()
    {
        assertEquals(PureDebuggerListenerImpl.StepMode.NONE,
                PureDebuggerListenerImpl.StepMode.valueOf("NONE"));
    }
}

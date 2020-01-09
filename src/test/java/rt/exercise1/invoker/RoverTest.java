package rt.exercise1.invoker;

import org.junit.jupiter.api.Test;
import rt.exercise1.command.Forward;
import rt.exercise1.command.Instruction;

import static org.mockito.Mockito.*;

class RoverTest {

    @Test
    void shouldExecuteInstruction() {
        Instruction forwardMock = mock(Forward.class);
        doNothing().when(forwardMock).execute();
        Rover rover = new Rover();
        rover.giveInstructions(forwardMock);
        verify(forwardMock).execute();
    }

}
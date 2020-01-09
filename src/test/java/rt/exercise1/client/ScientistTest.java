package rt.exercise1.client;

import org.junit.jupiter.api.Test;
import rt.exercise1.command.Forward;
import rt.exercise1.command.InstructionFactory;
import rt.exercise1.invoker.Rover;
import rt.exercise1.receiver.Driver;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class ScientistTest {

    @Test
    void givenInputFF_ShouldReturn_Position() {
        Scientist scientist;

        Driver mockDriver = mock(Driver.class);
        Rover mockRover = mock(Rover.class);
        InstructionFactory mockInstructionFactory = mock(InstructionFactory.class);
        Forward forward = new Forward(mockDriver);

        given(mockInstructionFactory.getInstruction("F", mockDriver)).willReturn(forward);
        doNothing().when(mockRover).giveInstructions(forward);

        scientist = new Scientist(mockRover, mockDriver, mockInstructionFactory);
        scientist.processInstructions("FF");

        verify(mockInstructionFactory, times(2)).getInstruction("F", mockDriver);
        verify(mockRover, times(2)).giveInstructions(forward);
        verify(mockDriver).getPosition();
    }
}

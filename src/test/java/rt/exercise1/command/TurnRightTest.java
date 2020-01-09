package rt.exercise1.command;

import org.junit.jupiter.api.Test;
import rt.exercise1.receiver.Driver;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class TurnRightTest {

    @Test
    void shouldExecuteTurnRight() {
        Driver mockDriver = mock(Driver.class);

        TurnRight turnRight = new TurnRight(mockDriver);
        turnRight.execute();

        verify(mockDriver).turnRight();
    }
}
package rt.exercise1.command;

import org.junit.jupiter.api.Test;
import rt.exercise1.receiver.Driver;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class TurnLeftTest {

    @Test
    void shouldExecuteTurnLeft() {
        Driver mockDriver = mock(Driver.class);

        TurnLeft turnLeft = new TurnLeft(mockDriver);
        turnLeft.execute();

        verify(mockDriver).turnLeft();
    }

}
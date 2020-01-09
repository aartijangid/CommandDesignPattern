package rt.exercise1.command;

import org.junit.jupiter.api.Test;
import rt.exercise1.receiver.Driver;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ForwardTest {

    @Test
    void shouldExecuteMove() {
        Driver mockDriver = mock(Driver.class);

        Forward forward = new Forward(mockDriver);
        forward.execute();


    }
}

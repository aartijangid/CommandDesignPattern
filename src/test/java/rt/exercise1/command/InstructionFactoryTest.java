package rt.exercise1.command;

import org.junit.jupiter.api.Test;
import rt.exercise1.receiver.Driver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

class InstructionFactoryTest {

    @Test
    void givenInputStringF_ShouldReturn_ForwardInstruction() {
        InstructionFactory instructionFactory = new InstructionFactory();
        Driver driver = new Driver();

        Instruction actualInstruction = instructionFactory.getInstruction("F", driver);

        assertThat(actualInstruction, instanceOf(Forward.class));
    }

    @Test
    void givenInputStringL_ShouldReturn_TurnLeftInstruction() {
        InstructionFactory instructionFactory = new InstructionFactory();
        Driver driver = new Driver();

        Instruction actualInstruction = instructionFactory.getInstruction("L", driver);

        assertThat(actualInstruction, instanceOf(TurnLeft.class));
    }

    @Test
    void givenInputStringR_ShouldReturn_TurnRightInstruction() {
        InstructionFactory instructionFactory = new InstructionFactory();
        Driver driver = new Driver();

        Instruction actualInstruction = instructionFactory.getInstruction("R", driver);

        assertThat(actualInstruction, instanceOf(TurnRight.class));
    }

}
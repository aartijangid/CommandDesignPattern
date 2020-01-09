package rt.exercise1.command;

import rt.exercise1.receiver.Driver;

public class InstructionFactory {
    public Instruction getInstruction(String input, Driver driver) {
        switch ((new InstructionInput(input)).getInstructionType()) {
            case LEFT:
                return new TurnLeft(driver);
            case RIGHT:
                return new TurnRight(driver);
            case FORWARD:
                return new Forward(driver);
            default:
                return null;
        }
    }
}

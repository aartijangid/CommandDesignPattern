package rt.exercise1.command;

import rt.exercise1.receiver.Driver;

public class InstructionFactory {
    public Instruction getInstruction(InstructionInput instruction, Driver driver){
        switch (instruction.getInstructionType()){
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

package rt.exercise1.command;

public class InstructionInput {

    InstructionType instructionType;

    public InstructionInput(String input){
        this.instructionType = InstructionType.get(input);
    }

    public InstructionType  getInstructionType() {
        return instructionType;
    }

    public void setInstructionType(InstructionType instructionType) {
        this.instructionType = instructionType;
    }
}

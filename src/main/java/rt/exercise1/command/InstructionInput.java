package rt.exercise1.command;

class InstructionInput {

    private InstructionType instructionType;

    InstructionInput(String input) {
        this.instructionType = InstructionType.get(input);
    }

    InstructionType getInstructionType() {
        return instructionType;
    }
}

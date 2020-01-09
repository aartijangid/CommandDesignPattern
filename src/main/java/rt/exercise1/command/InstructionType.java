package rt.exercise1.command;

import java.util.HashMap;
import java.util.Map;

public enum InstructionType {
    LEFT("L"), RIGHT("R"), FORWARD("F");

    private static final Map<String, InstructionType> commandMap = new HashMap<>();

    private final String instructionChar;

    InstructionType(String instructionChar) {
        this.instructionChar = instructionChar;
    }

    static {
        for (InstructionType instructionType : InstructionType.values()) {
            commandMap.put(instructionType.instructionChar, instructionType);
        }
    }

    public static InstructionType get(String instructionChar) {
        return commandMap.get(instructionChar);
    }

}

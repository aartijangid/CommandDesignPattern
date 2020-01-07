package rt.exercise1.invoker;

import rt.exercise1.command.Instruction;

public class Rover {

    public void giveInstructions(Instruction instruction){
        instruction.execute();
    }
}

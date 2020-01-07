package rt.exercise1.client;

import rt.exercise1.command.Instruction;
import rt.exercise1.command.InstructionFactory;
import rt.exercise1.command.InstructionInput;
import rt.exercise1.invoker.Rover;
import rt.exercise1.receiver.Driver;

import java.util.Arrays;

public class Scientist {

    public void processInstructions(String userInput) {
        InstructionInput instructionInput;
        InstructionFactory instructionFactory = new InstructionFactory();
        Rover rover = new Rover();
        Driver driver = new Driver();
        String[] inputs = userInput.split("");
        for (int i = 0; i < inputs.length; i++) {
            instructionInput = new InstructionInput(inputs[i]);
            Instruction instruction = instructionFactory.getInstruction(instructionInput, driver);
            rover.giveInstructions(instruction);
        }
        System.out.println("Position of land rover: " + Arrays.toString(driver.getPosition()));
    }
}

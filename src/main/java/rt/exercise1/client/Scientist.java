package rt.exercise1.client;

import rt.exercise1.command.Instruction;
import rt.exercise1.command.InstructionFactory;
import rt.exercise1.invoker.Rover;
import rt.exercise1.receiver.Driver;

import java.util.Arrays;

class Scientist {

    private Rover rover;
    private Driver driver;
    private InstructionFactory instructionFactory;

    Scientist() {
        this.rover = new Rover();
        this.driver = new Driver();
        this.instructionFactory = new InstructionFactory();
    }

    Scientist(Rover rover, Driver driver, InstructionFactory instructionFactory) {
        this.rover = rover;
        this.driver = driver;
        this.instructionFactory = instructionFactory;
    }

    void processInstructions(String userInput) {
        String[] inputs = userInput.split("");
        for (String input : inputs) {
            Instruction instruction = instructionFactory.getInstruction(input, driver);
            rover.giveInstructions(instruction);
        }
        System.out.println("Position of land rover: " + Arrays.toString(driver.getPosition()));
    }
}

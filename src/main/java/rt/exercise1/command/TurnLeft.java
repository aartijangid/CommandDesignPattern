package rt.exercise1.command;

import rt.exercise1.command.Instruction;
import rt.exercise1.receiver.Driver;

public class TurnLeft implements Instruction {

    private Driver driver;

    public TurnLeft(Driver driver){
        this.driver = driver;
    }

    public void execute() {
        driver.turnLeft();
    }
}

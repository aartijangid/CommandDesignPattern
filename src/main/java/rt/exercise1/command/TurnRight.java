package rt.exercise1.command;

import rt.exercise1.receiver.Driver;

public class TurnRight implements Instruction {
    private Driver driver;

    TurnRight(Driver driver) {
        this.driver = driver;
    }

    public void execute() {
        driver.turnRight();
    }
}

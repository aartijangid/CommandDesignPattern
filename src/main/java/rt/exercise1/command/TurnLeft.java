package rt.exercise1.command;

import rt.exercise1.receiver.Driver;

public class TurnLeft implements Instruction {

    private Driver driver;

    TurnLeft(Driver driver) {
        this.driver = driver;
    }

    public void execute() {
        driver.turnLeft();
    }
}

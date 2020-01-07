package rt.exercise1.command;

import rt.exercise1.command.Instruction;
import rt.exercise1.receiver.Driver;

public class Forward implements Instruction {
    private Driver driver;

    public Forward(Driver driver){
        this.driver = driver;
    }

    public void execute() {
            driver.move();
    }
}

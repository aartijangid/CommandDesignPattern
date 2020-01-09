package rt.exercise1.receiver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DriverTest {

    @Test
    void getPosition_ShouldReturn_CurrentRoverCoOrdinates() {
        Driver driver = new Driver();
        assertArrayEquals(driver.getPosition(), new int[]{0, 0});
    }

    @Test
    void givenDirection0Degree_ShouldMovePositionInPositiveXAxis() {
        Driver driver = new Driver();
        driver.setDirection(0);
        driver.move();
        assertArrayEquals(driver.getPosition(), new int[]{1, 0});
    }

    @Test
    void givenDirection90Degree_ShouldMovePositionInPositiveYAxis() {
        Driver driver = new Driver();
        driver.setDirection(90);
        driver.move();
        assertArrayEquals(driver.getPosition(), new int[]{0, 1});
    }

    @Test
    void givenDirection180Degree_ShouldMovePositionInNegativeXAxis() {
        Driver driver = new Driver();
        driver.setDirection(180);
        driver.move();
        assertArrayEquals(driver.getPosition(), new int[]{-1, 0});
    }

    @Test
    void givenDirection270Degree_ShouldMovePositionInNegativeYAxis() {
        Driver driver = new Driver();
        driver.setDirection(270);
        driver.move();
        assertArrayEquals(driver.getPosition(), new int[]{0, -1});
    }

    @Test
    void givenDirection0Degree_turnLeftShouldSetDirection_90Degrees() {
        Driver driver = new Driver();
        driver.setDirection(0);
        driver.turnLeft();
        assertEquals(driver.getDirection(), 90);
    }

    @Test
    void givenDirection270Degree_turnLeftShouldSetDirection_0Degrees() {
        Driver driver = new Driver();
        driver.setDirection(270);
        driver.turnLeft();
        assertEquals(driver.getDirection(), 0);
    }

    @Test
    void givenDirection0Degree_turnRightShouldSetDirection_270Degree() {
        Driver driver = new Driver();
        driver.setDirection(0);
        driver.turnRight();
        assertEquals(driver.getDirection(), 270);
    }

    @Test
    void givenDirection270Degree_turnRightShouldSetDirection_180Degree() {
        Driver driver = new Driver();
        driver.setDirection(270);
        driver.turnRight();
        assertEquals(driver.getDirection(), 180);
    }
}
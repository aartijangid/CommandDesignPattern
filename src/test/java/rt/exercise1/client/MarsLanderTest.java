package rt.exercise1.client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsLanderTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void processInputTestPrintsRoverPositionAfterSuccessfulProcessing() {
        String input = "LFF";
        MarsLander.processInput(input);
        assertEquals("Position of land rover: [0, 2]\n", outContent.toString());
    }

    @Test
    void processInputTestSkipsInvalidInstructions() {
        String input = "LF1FR";
        MarsLander.processInput(input);
        assertEquals("Skipping invalid instruction: LF1FR\n", outContent.toString());
    }
}
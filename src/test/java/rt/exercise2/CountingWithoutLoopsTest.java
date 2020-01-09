package rt.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CountingWithoutLoopsTest {
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
    void countUpTest(){
        CountingWithoutLoops countingWithoutLoops = new CountingWithoutLoops();
        System.out.println("Count up:");
        countingWithoutLoops.countUp(0, 5);
        assertEquals("Count up:\n0\n1\n2\n3\n4\n5\n", outContent.toString());
    }

    @Test
    void countUpAndDownTest(){
        CountingWithoutLoops countingWithoutLoops = new CountingWithoutLoops();
        System.out.println("Count up:");
        countingWithoutLoops.countUpAndDown(0, 5);
        assertEquals("Count up:\n0\n1\n2\n3\n4\n5\n4\n3\n2\n1\n0\n", outContent.toString());
    }
}
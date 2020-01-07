package rt.exercise1.client;

import java.util.Scanner;

public class MarsLander {

    public static void main(String arg[]) {
        String userInput;
        Scientist scientist = new Scientist();
        try (
                Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter instruction: ");
                userInput = scanner.nextLine();
                scientist.processInstructions(userInput);
            }
        }
    }
}

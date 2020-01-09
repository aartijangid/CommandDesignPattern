package rt.exercise1.client;

import java.util.Scanner;

public class MarsLander {

    public static void main(String[] arg) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.print("Enter instruction [L-Left, R-Right, F-Forward, Q-Quit]: ");
                userInput = scanner.nextLine();
                processInput(userInput);
            } while (!userInput.equalsIgnoreCase("Q"));
        } catch (Exception e) {
            scanner.close();
            e.printStackTrace();
        }
    }

    static void processInput(String userInput) {
        Scientist scientist = new Scientist();
        if (userInput.matches("[LRF]+"))
            scientist.processInstructions(userInput);
        else if (!userInput.equalsIgnoreCase("Q"))
            System.out.println("Skipping invalid instruction: " + userInput);
    }
}

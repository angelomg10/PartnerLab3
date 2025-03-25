import java.util.Random;
import java.util.Scanner;

/**
 * Guessing Game Program
 * Generates a random number between 1 and 100 and allows the user to guess it within 5 tries.
 *
 * Author: Guillermo Angel
 * Date: 3/21/2025
 */
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do { playGame(scanner); } while (askToPlayAgain(scanner));
        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static void playGame(Scanner scanner) {
        int target = new Random().nextInt(100) + 1, attempts = 5;
        System.out.println("I'm thinking of a number between 1 and 100. You have 5 tries:");

        while (attempts > 0) {
            System.out.print("Your guess: ");
            if (!scanner.hasNextInt()) { scanner.next(); continue; }
            int guess = scanner.nextInt();

            if (guess == target) { System.out.println("You got it!"); return; }
            System.out.println("Nope! Too " + (guess < target ? "low" : "high") +
                    ". Try again (" + --attempts + " left)");
        }
        System.out.println("You lost! The number was " + target);
    }

    private static boolean askToPlayAgain(Scanner scanner) {
        System.out.print("Play again? (Y/N): ");
        return scanner.next().trim().equalsIgnoreCase("Y");
    }
}


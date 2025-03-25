import java.util.Objects;
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

        //sdk user which game
        String usersChoice;
        Scanner input = new Scanner(System.in);

        //call the loop
        do {
            System.out.println("type exit to stop, type 1 for rock paper scissors, type 2 to play guessing game");
            usersChoice = input.nextLine();
            if (Objects.equals(usersChoice, "1")) {
                rpsGame();
            } else if (Objects.equals(usersChoice, "2")) {

                Scanner scanner = new Scanner(System.in);
                playGame(scanner);

            }

        } while (!usersChoice.equalsIgnoreCase("exit"));

//        Scanner scanner = new Scanner(System.in);
//        do { playGame(scanner); } while (askToPlayAgain(scanner));
//        System.out.println("Thanks for playing!");
//        scanner.close();
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

    public static void rpsGame(){


        Scanner answer = new Scanner(System.in);
        Random rand = new Random();
        String result = " ";

        System.out.println("Hello welcome, be ready!");
        //maybe delete ***System.out.println("type 'exit' to stop program or type 1 to play rock paper scissors: ");



        //run game

        //create list for p2 answers
        String[] numbers = new String[]{"rock", "paper", "scissors"};
        //make player one (p1) choice
        String p1;

        //make player two (p2) choice
        String p2;

        System.out.println("type: 'rock', 'paper', or 'scissors' ");
        p1 = answer.nextLine();


        //creating p2 (bot) choice

        p2 = numbers[rand.nextInt(2 - 0 + 1) + 0];

        if (Objects.equals(p1, p2)) {
            System.out.println("Players 1 choice: "+ p1);
            System.out.println("Players 2 choice: "+ p2);
            result = "tie";
        } else if (Objects.equals(p1, "rock") && Objects.equals(p2, "scissors")) {
            System.out.println("Players 1 choice: "+ p1);
            System.out.println("Players 2 choice: "+ p2);
            result = "You won by luck haha";
        } else if (Objects.equals(p1, "scissors") && Objects.equals(p2, "paper")) {
            System.out.println("Players 1 choice: "+ p1);
            System.out.println("Players 2 choice: "+ p2);
            result = "You won by luck haha";
        } else if (Objects.equals(p1, "paper") && Objects.equals(p2, "rock")) {
            System.out.println("Players 1 choice: "+ p1);
            System.out.println("Players 2 choice: "+ p2);
            result = "You won by luck haha";
        } else if (Objects.equals(p1, "paper") && Objects.equals(p2, "scissors")) {
            System.out.println("Players 1 choice: "+ p1);
            System.out.println("Players 2 choice: "+ p2);
            result = "You lost nub";
        } else if (Objects.equals(p1, "scissors") && Objects.equals(p2, "rock")) {
            System.out.println("Players 1 choice: "+ p1);
            System.out.println("Players 2 choice: "+ p2);
            result = "You lost nub";
        } else if (Objects.equals(p1, "rock") && Objects.equals(p2, "paper")) {
            System.out.println("Players 1 choice: "+ p1);
            System.out.println("Players 2 choice: "+ p2);
            result = "You lost nub";
        }

        System.out.println(result);




    }
}


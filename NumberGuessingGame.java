import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I've selected a random number between 1 and 100. Try to guess it.");
        while (true) {
            System.out.print("Enter your guess: ");
            try {
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
                } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
                } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
                } else {
                System.out.println("Congratulations! You've guessed the number " + secretNumber + " in " + attempts + " attempts.");
                break;
                }
            } 
            catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }
        scanner.close(); // Close the scanner
    }
}

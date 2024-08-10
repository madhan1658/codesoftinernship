import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;
        int roundsWon = 0;
        
        do {
            int numberToGuess = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            
            System.out.println("Guess a number between 1 and 100:");
            
            while (attempts < 10 && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;
                
                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number.");
                    hasGuessedCorrectly = true;
                    roundsWon++;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The number was " + numberToGuess);
            }
            
            System.out.print("Do you want to play again? (true/false): ");
            playAgain = scanner.nextBoolean();
        } while (playAgain);
        
        System.out.println("You've won " + roundsWon + " rounds.");
        scanner.close();
    }
}

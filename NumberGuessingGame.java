import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int numGuesses = 0;
        int score = 100;
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;
            
            if (guess == randomNumber) {
                System.out.println("You guessed it! The number was " + randomNumber + ".");
                System.out.println("It took you " + numGuesses + " guesses.");
                System.out.println("Your score is " + score);
            } else if (guess < randomNumber) {
                System.out.println("Too low! Guess again.");
                score -= 10;
            } else {
                System.out.println("Too high! Guess again.");
                score -= 10;
            }
        } while (guess != randomNumber && score > 0);
        
        if (score <= 0) {
            System.out.println("Game over! You have run out of points.");
        }
        
        scanner.close();
    }
}


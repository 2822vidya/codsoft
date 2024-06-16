import java.util.*;

public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");

        do {
            // Start a new round
            playRound(scanner);

        } while (playAgain(scanner));

        scanner.close();
        System.out.println("Thanks for playing!");
    }

    public static void playRound(Scanner scanner) {
        int attempts = 5; // Number of attempts allowed
        int numberToGuess = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100

        while (attempts > 0) {
            System.out.println("Guess a number between 1 and 100 (Attempts remaining: " + attempts + "):");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + (attempts) + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again!");
            } else {
                System.out.println("Too high. Try again!");
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Sorry, you ran out of attempts. The number was " + numberToGuess);
        }
    }

    public static boolean playAgain(Scanner scanner) {
        System.out.println("Play again? (y/n): ");
        String choice = scanner.nextLine().toLowerCase();
        return choice.equals("y");
    }
}


import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 10) +1;
        int attempts = 0;
        boolean guessed = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guesser Game!");
        System.out.println("Try to guess the secret number between 1 and 10.");

        
        while (!guessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the secret number " + secretNumber + " in " + attempts + " attempts.");
                guessed = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        System.out.println();

        scanner.close();
    }
}

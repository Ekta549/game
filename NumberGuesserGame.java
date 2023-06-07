import java.util.Scanner;

public class NumberGuesserGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Guesser Game!");
        
        System.out.println("Player 1, enter the range for the number:");
        System.out.print("Enter the minimum number: ");
        int minNum = input.nextInt();
        

        System.out.print("Enter the maximum number: ");
        int maxNum = input.nextInt();
        
        int secretNumber = getRandomNumber(minNum, maxNum);
        System.out.println("The secret number has been generated between " + minNum + " and " + maxNum + ".");
        
        while (true) {
            System.out.print("Player 1, enter your guess: ");
            int player1Guess = input.nextInt();
            
            System.out.print("Player 2, enter your guess: ");
            int player2Guess = input.nextInt();
            
            if (player1Guess == secretNumber) {
                System.out.println("Player 1 wins! The secret number is " + secretNumber + ".");
                break;
            } else if (player2Guess == secretNumber) {
                System.out.println("Player 2 wins! The secret number is " + secretNumber + ".");
                break;
            } else {
                System.out.println("Both players' guesses are incorrect. Try again!");
            }
        }
        
        input.close();
    }
    
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
 
    


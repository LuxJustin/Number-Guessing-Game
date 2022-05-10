import java.util.Random; // Import Random class.
import java.util.Scanner; // Import Scanner class.

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random(); // Create Random Object.
        Scanner input = new Scanner(System.in); // Create Scanner object.

        int randInt =  random.nextInt((100 - 1) + 1) + 1; // Generate random number from 1 to 10.
        int guess; 
        boolean win = false;

        System.out.println("Random Number Guessing Game");
        System.out.println();

        while (!win) { // Repeat while win is not true.
            System.out.print("Enter a number from 1 to 100: ");
            guess = input.nextInt(); // Get user input.
            
            if(guess == randInt) { // Check if guess equals random number.
                System.out.println("You Win!");
                win = true;
            }
            // Check if answer is lower or higher.
            else if (guess > randInt) {
                System.out.println("The answer is lower!");
            }
            else {
                System.out.println("The answer is higher!");
            }
            System.out.println();
        }
        input.close(); // Close scanner object.
    }
}

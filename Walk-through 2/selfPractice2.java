//2. Implement a do-while loop that keeps asking for input until the user enters “exit”. */
import java.util.Scanner;
import java.util.Random;

public class selfPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100 (or type 'exit' to quit):");
        
        do {
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                
                if (guess < number) {
                    System.out.println("Too low, try again!");
                } else if (guess > number) {
                    System.out.println("Too high, try again!");
                } else {
                    System.out.println("Correct! You guessed the number.");
                    break;
                }
            } else if (scanner.hasNext("exit")) {
                System.out.println("Game exited.");
                break;
            } else {
                System.out.println("Invalid input, please enter a number or 'exit'.");
                scanner.next();
            }
        } while (true);
        
        scanner.close();
    }
}
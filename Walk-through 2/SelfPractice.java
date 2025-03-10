//*1. Create a guessing game where the user has to guess a random number.
import java.util.Random;
import java.util.Scanner;

public class SelfPractice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int s;

        System.out.println("Guess a number between 1 and 100:");
        
        while (true) {
            s = scanner.nextInt();
            
            if (s < number) {
                System.out.println("Too low, try again!");
            } else if (s > number) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Correct! You guessed the number.");
                break;
            }
        }
        
        scanner.close();
    }
}
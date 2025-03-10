/*Create a switch-case program that displays the name of a day based on a number
input (1 for Monday, 2 for Tuesday, etc.) */
import java.util.Scanner;

public class guidetask2 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the day of the week: ");
        int week = s.nextInt();     
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number! Please enter a number between 1 and 7 only.");
        }
        s.close();
    }
    
}

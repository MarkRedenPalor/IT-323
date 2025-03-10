//1. Modify the code to take user input for name and age.

import java.util.Scanner; 

public class SelfPractice{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();      
        System.out.print("Enter your age: ");
        int age = s.nextInt(); 
        System.out.println("Greetings, " + name  +  ", " +  age + " yaers old");      
        s.close(); 
    }
}

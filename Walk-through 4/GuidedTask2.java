//Implement a Linear Search to find an element in an array
import java.util.Arrays;
import java.util.Scanner;

public class GuidedTask2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available array: " + Arrays.toString(arr));
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                scanner.close();
                return;
            }
        }
        System.out.println("Element not found.");
        scanner.close();
    }
}

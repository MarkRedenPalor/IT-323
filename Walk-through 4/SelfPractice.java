//1. Modify the program to accept user input for an array.
import java.util.Arrays;
import java.util.Scanner;

public class SelfPractice {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] a = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        
        System.out.print("Enter number to search: ");
        int x = s.nextInt();
        
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            
            if (a[m] == x) {
                System.out.println("Found at index: " + m);
                s.close();
                return;
            }
            
            if (a[m] < x) l = m + 1;
            else r = m - 1;
        }
        
        System.out.println("Not found.");
        s.close();
    }
}


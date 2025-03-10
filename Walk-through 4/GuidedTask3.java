//Convert the Linear Search into a Binary Search
import java.util.Arrays;
import java.util.Scanner;

public class GuidedTask3 {
     public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        Arrays.sort(a);
        
        System.out.println("Sorted array: " + Arrays.toString(a));
        
        Scanner s = new Scanner(System.in);
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

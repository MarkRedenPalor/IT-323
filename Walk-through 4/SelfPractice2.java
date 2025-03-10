//2. Implement insertion sort on an array of strings.
import java.util.Arrays;
import java.util.Scanner;

public class SelfPractice2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of strings: ");
        int n = s.nextInt();
        s.nextLine(); 
        
        String[] arr = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) arr[i] = s.nextLine();
        
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
        
        System.out.println("Sorted: " + Arrays.toString(arr));
        s.close();
    }
}

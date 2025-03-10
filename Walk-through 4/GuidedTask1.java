//Modify the program to implement Selection Sort.
import java.util.Arrays;

public class GuidedTask1 {
     public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
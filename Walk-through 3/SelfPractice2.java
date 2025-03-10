// 2.. Implement a program to remove duplicates from an array
import java.util.Arrays;

public class SelfPractice2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Arrays.sort(array);
        
        int[] temp = new int[array.length];
        int j = 0;
        
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length - 1];
        
        int[] uniqueArray = Arrays.copyOf(temp, j);
        
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}

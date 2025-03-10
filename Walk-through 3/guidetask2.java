//Find the maximum and minimum value in an array.
public class guidetask2 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 33, 67};
        int max = numbers[0], min = numbers[0];

        System.out.println("Array Elements:");
        for (int n : numbers) {
            System.out.println(n);
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

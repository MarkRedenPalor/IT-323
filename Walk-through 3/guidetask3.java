//Reverse an array using a loop.
public class guidetask3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original: ");
        for (int num : numbers) 
        System.out.print(num + " ");

        System.out.println("\nReversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) 
        System.out.print(numbers[i] + " ");
    }
}

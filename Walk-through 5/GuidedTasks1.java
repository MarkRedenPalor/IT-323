// Modify the program to find the sum of all elements in the matrix.
public class GuidedTasks1 {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int s = 0;
        System.out.println("Matrix:");
        for (int[] r : m) {
            for (int n : r) {
                System.out.print(n + " ");
                s += n;
            }
            System.out.println();
        }
        
        System.out.println("Sum: " + s);
    }
}
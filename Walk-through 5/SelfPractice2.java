public class SelfPractice2 {
    public static void main(String[] args) {
        int[][] x = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] t = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[j][i] = x[i][j];
            }
        }
        
        System.out.println("Transpose:");
        for (int[] r : t) {
            for (int n : r) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

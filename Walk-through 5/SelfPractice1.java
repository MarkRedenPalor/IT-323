public class SelfPractice1 {
    public static void main(String[] args) {
        int[][] x = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        
        boolean symmetric = true;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] != x[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) break;
        }
        
        System.out.println(symmetric ? "Matrix is symmetric" : "Matrix is not symmetric");
    }
}

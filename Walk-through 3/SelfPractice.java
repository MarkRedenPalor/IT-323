//1. Write a program that merges two arrays.


public class SelfPractice {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        int[] c = new int[a.length + b.length];
        

        int i, j;
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (j = 0; j < b.length; j++) {
            c[i + j] = b[j];
        }
        
        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}

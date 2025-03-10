//Create an array of 5 student grades and calculate the average
public class guidetask1 {
    
    public static void main(String[] args) {
        int[] grades = {90, 78, 83, 96, 87};
        int sum = 0;

        System.out.println("Student Grades:");
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        System.out.println("Average Grade: " + (sum / grades.length));
    }
    }
    


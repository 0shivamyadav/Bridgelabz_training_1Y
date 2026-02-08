import java.util.*;

public class students2D {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sy.nextInt();

        int[][] marks = new int[n][3]; // 3 subjects
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sy.nextInt();
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] < 40) grade[i] = "R";
            else if (percent[i] < 50) grade[i] = "E";
            else if (percent[i] < 60) grade[i] = "D";
            else if (percent[i] < 70) grade[i] = "C";
            else if (percent[i] < 80) grade[i] = "B";
            else grade[i] = "A";
        }

        System.out.println("\n----- Result -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Percentage: " + percent[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}

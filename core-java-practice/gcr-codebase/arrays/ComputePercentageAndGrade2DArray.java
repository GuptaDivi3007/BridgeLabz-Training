import java.util.*;

public class ComputePercentageAndGrade2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            double phy = sc.nextDouble();
            double chem = sc.nextDouble();
            double maths = sc.nextDouble();

            if (phy < 0 || chem < 0 || maths < 0) {
                i--;
                continue;
            }

            marks[i][0] = phy;
            marks[i][1] = chem;
            marks[i][2] = maths;
        }

        for (int i = 0; i < n; i++) {
            double sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = sum / 3;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            }
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            }
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            }
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            }
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            }
            else {
                grade[i] = 'R';
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0]);
            System.out.println(marks[i][1]);
            System.out.println(marks[i][2]);
            System.out.println(percentage[i]);
            System.out.println(grade[i]);
        }
    }
}

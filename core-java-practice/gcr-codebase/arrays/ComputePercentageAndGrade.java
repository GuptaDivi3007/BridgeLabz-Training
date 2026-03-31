import java.util.*;

public class ComputePercentageAndGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] phy = new double[n];
        double[] chem = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            double p = sc.nextDouble();
            double c = sc.nextDouble();
            double m = sc.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }

            phy[i] = p;
            chem[i] = c;
            maths[i] = m;
        }

        for (int i = 0; i < n; i++) {
            double total = phy[i] + chem[i] + maths[i];
            percentage[i] = total / 3;

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
            System.out.println(phy[i]);
            System.out.println(chem[i]);
            System.out.println(maths[i]);
            System.out.println(percentage[i]);
            System.out.println(grade[i]);
        }
    }
}

import java.util.*;

public class BMI2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] data = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                i--;
                continue;
            }

            data[i][0] = height;
            data[i][1] = weight;
        }

        for (int i = 0; i < n; i++) {
            double height = data[i][0];
            double weight = data[i][1];

            double bmi = weight / (height * height);
            data[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(data[i][0]);
            System.out.println(data[i][1]);
            System.out.println(data[i][2]);
            System.out.println(weightStatus[i]);
        }
    }
}

import java.util.*;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = 10;

        double[][] hw = new double[persons][2];
        for (int i = 0; i < persons; i++) {
            hw[i][0] = sc.nextDouble(); // weight
            hw[i][1] = sc.nextDouble(); // height
        }

        String[][] result = computeBMI(hw);
        display(result);
    }

    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    static void display(String[][] table) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < table.length; i++) {
            System.out.println(
                Double.parseDouble(table[i][0]) + "\t\t" +
                Double.parseDouble(table[i][1]) + "\t\t" +
                Double.parseDouble(table[i][2]) + "\t" +
                table[i][3]
            );
        }
    }
}

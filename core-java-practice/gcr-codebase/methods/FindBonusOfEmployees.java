import java.util.*;

public class FindBonusOfEmployees {

    public static void main(String[] args) {
        double[][] data = generateEmployeeData(10);
        double[][] updatedData = calculateNewSalaryAndBonus(data);
        displaySummary(data, updatedData);
    }

    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + random.nextInt(90000);
            data[i][1] = 1 + random.nextInt(10);
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] ans = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            ans[i][0] = newSalary;
            ans[i][1] = bonus;
        }
        return ans;
    }

    public static void displaySummary(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Old Salary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((int) oldSalary + "\t\t" + (int) years + "\t" + (int) bonus + "\t" + (int) newSalary);
        }

        System.out.println("\nTotal Old Salary: " + (int) totalOldSalary);
        System.out.println("Total Bonus: " + (int) totalBonus);
        System.out.println("Total New Salary: " + (int) totalNewSalary);
    }
}

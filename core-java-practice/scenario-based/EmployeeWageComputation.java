import java.util.*;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // Use Case 1
        checkEmployeeAttendance();

        // Use Case 2
        calculateDailyWage();

        // Use Case 3
        calculatePartTimeWage();

        // Use Case 4
        calculateWageUsingSwitch();

        // Use Case 5
        calculateMonthlyWage();

        // Use Case 6
        calculateWageTillCondition();
    }



    // Use Case 1:
    // Check Employee is Present or Absent
    
    public static void checkEmployeeAttendance() {
        int isPresent = new Random().nextInt(2);

        if (isPresent == 1) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }

    // Use Case 2:
    // Calculate Daily Employee Wage

    public static void calculateDailyWage() {
        int wagePerHour = 20;
        int workingHours = 8;

        int dailyWage = wagePerHour * workingHours;
        System.out.println("Daily Employee Wage = " + dailyWage);
    }

    // Use Case 3:
    // Add Part Time Employee & Wage

    public static void calculatePartTimeWage() {
        int wagePerHour = 20;
        int workingHours = 4;

        int partTimeWage = wagePerHour * workingHours;
        System.out.println("Part Time Employee Wage = " + partTimeWage);
    }

    // Use Case 4:
    // Solve using Switch Case

    public static void calculateWageUsingSwitch() {
        int wagePerHour = 20;
        int empType = new Random().nextInt(3);
        int empHour = 0;

        switch (empType) {
            case 1:
                empHour = 8;   // Full Time
                break;
            case 2:
                empHour = 4;   // Part Time
                break;
            default:
                empHour = 0;   // Absent
        }

        int wage = empHour * wagePerHour;
        System.out.println("Employee Wage Using Switch = " + wage);
    }

    // Use Case 5:
    // Calculating Wages for a Month

    public static void calculateMonthlyWage() {
        int wagePerHour = 20;
        int workingHours = 8;
        int workingDays = 20;

        int monthlyWage = wagePerHour * workingHours * workingDays;
        System.out.println("Monthly Employee Wage = " + monthlyWage);
    }

    // Use Case 6:
    // Calculate Wages till Total Working Hours or Days is Reached

    public static void calculateWageTillCondition() {
        int wagePerHour = 20;
        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            totalDays++;
            int empType = new Random().nextInt(3);
            int empHour = 0;

            switch (empType) {
                case 1:
                    empHour = 8;
                    break;
                case 2:
                    empHour = 4;
                    break;
                default:
                    empHour = 0;
            }

            totalHours += empHour;
        }

        int totalWage = totalHours * wagePerHour;
        System.out.println("Total Wage Till Condition = " + totalWage);
    }
}

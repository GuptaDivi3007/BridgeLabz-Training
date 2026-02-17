package EmployeeWages.employeeWages;
import java.util.ArrayList;
import java.util.List;
public class CompanyEmployeeWage {

    private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;
    private List<Integer> dailyWages;

    public CompanyEmployeeWage(String companyName, int wagePerHour,
                                int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
    }

    // Getters and Setters
    public String getCompanyName() { return companyName; }
    public int getWagePerHour() { return wagePerHour; }
    public int getMaxWorkingDays() { return maxWorkingDays; }
    public int getMaxWorkingHours() { return maxWorkingHours; }
    public int getTotalWage() { return totalWage; }
    public List<Integer> getDailyWages() { return dailyWages; }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}

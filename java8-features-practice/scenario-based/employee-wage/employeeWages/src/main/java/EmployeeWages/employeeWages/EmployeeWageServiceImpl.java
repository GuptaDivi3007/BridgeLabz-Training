package EmployeeWages.employeeWages;
import java.util.*;
import java.util.Random;
import java.util.regex.Pattern;
public class EmployeeWageServiceImpl implements IEmployeeWageService {
    private EmployeeWageRepository repository = new EmployeeWageRepository();
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    @Override
    public void addCompany(String companyName, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours) {

        // Regex validation for company name
        if (!Pattern.matches("^[A-Za-z]{3,}$", companyName)) {
            throw new IllegalArgumentException("Invalid Company Name!");
        }

        CompanyEmployeeWage company =
                new CompanyEmployeeWage(companyName, wagePerHour,
                        maxWorkingDays, maxWorkingHours);

        repository.addCompany(company);
    }

    @Override
    public void computeWages() {

        for (CompanyEmployeeWage company : repository.getCompanies()) {

            int totalWorkingDays = 0;
            int totalWorkingHours = 0;
            int totalWage = 0;

            Random random = new Random();

            while (totalWorkingDays < company.getMaxWorkingDays()
                    && totalWorkingHours < company.getMaxWorkingHours()) {

                totalWorkingDays++;
                int empCheck = random.nextInt(3);
                int empHours = 0;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHours = 8;
                        break;
                    case IS_PART_TIME:
                        empHours = 4;
                        break;
                    default:
                        empHours = 0;
                }

                totalWorkingHours += empHours;
                int dailyWage = empHours * company.getWagePerHour();
                company.getDailyWages().add(dailyWage);
                totalWage += dailyWage;
            }

            company.setTotalWage(totalWage);
        }
    }

    @Override
    public int getTotalWageByCompany(String companyName) {
        return repository.getCompanies()
                .stream()
                .filter(c -> c.getCompanyName().equals(companyName))
                .map(CompanyEmployeeWage::getTotalWage)
                .findFirst()
                .orElse(0);
    }
}

package EmployeeWages.employeeWages;
public interface IEmployeeWageService {

    void addCompany(String companyName, int wagePerHour,
                    int maxWorkingDays, int maxWorkingHours);

    void computeWages();

    int getTotalWageByCompany(String companyName);
}

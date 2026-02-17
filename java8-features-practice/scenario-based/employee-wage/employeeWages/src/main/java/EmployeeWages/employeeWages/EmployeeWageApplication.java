package EmployeeWages.employeeWages;
public class EmployeeWageApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmployeeWageService wageService = new EmployeeWageServiceImpl();

        wageService.addCompany("TCS", 20, 20, 100);
        wageService.addCompany("Infosys", 25, 22, 120);

        wageService.computeWages();

        System.out.println("Total Wage for TCS: "
                + wageService.getTotalWageByCompany("TCS"));
    }
}

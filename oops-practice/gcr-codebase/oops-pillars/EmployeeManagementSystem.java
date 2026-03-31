import java.util.*;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    int getEmployeeId() {
        return employeeId;
    }

    String getName() {
        return name;
    }

    void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Rohan", 50000);
        e1.assignDepartment("HR");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Kannan", 80, 300);
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
            }
            System.out.println("-------------------");
        }
    }
}

import java.util.*;

public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Manager manager = new Manager(501, "IT", 75000.0, "Team Lead");
        manager.displayDetails();
        manager.updateSalary(82000.0);
        manager.displayDetails();
    }
}
public class Manager extends Employee {

    public String role;

    public Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Role: " + role);
    }
}

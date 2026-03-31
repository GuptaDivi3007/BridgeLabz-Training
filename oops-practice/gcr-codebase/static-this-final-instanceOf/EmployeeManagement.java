import java.util.*;

public class EmployeeManagement {

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Thamarai", "Software Engineer");
        Employee e2 = new Employee(102, "Rohan", "Project Manager");

        Employee.displayTotalEmployees();

        if (e1 instanceof Employee) {
            e1.displayDetails();
        }

        if (e2 instanceof Employee) {
            e2.displayDetails();
        }
    }
}

class Employee {

    static String companyName = "Tech Solutions Inc.";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

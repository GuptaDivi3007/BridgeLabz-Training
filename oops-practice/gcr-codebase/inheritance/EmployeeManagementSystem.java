import java.util.*;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee e1 = new Manager("Harry", 101, 90000, 8);
        Employee e2 = new Developer("Nikita", 102, 80000, "Java");
        Employee e3 = new Intern("Harsh", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + language);
    }
}

class Intern extends Employee {
    int internDuration;

    Intern(String name, int id, double salary, int internDuration) {
        super(name, id, salary);
        this.internDuration = internDuration;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internDuration + " months");
    }
}

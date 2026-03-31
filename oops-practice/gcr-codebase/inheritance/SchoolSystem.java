import java.util.*;

public class SchoolSystem {

    public static void main(String[] args) {
        Person teacher = new Teacher("Meena", 40, "Mathematics");
        Person student = new Student("Arjun", 16, "10th Grade");
        Person staff = new Staff("Ravi", 45, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Person in school");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher handling subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student studying in: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Staff working in department: " + department);
    }
}

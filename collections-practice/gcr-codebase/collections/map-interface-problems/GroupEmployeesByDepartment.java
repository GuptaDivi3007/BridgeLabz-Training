import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupEmployeesByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee emp : employees) {
            grouped
                .computeIfAbsent(emp.department, k -> new ArrayList<>())
                .add(emp);
        }

        grouped.forEach((dept, list) ->
            System.out.println(dept + ": " + list)
        );
    }
}
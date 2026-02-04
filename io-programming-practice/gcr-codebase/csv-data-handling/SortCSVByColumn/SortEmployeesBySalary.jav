import java.io.*;
import java.util.*;

public class SortEmployeesBySalary {

    static class Employee {
        String id;
        String name;
        String department;
        double salary;

        Employee(String id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                employees.add(new Employee(
                        data[0],
                        data[1],
                        data[2],
                        Double.parseDouble(data[3])
                ));
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
            return;
        }

        employees.sort((a, b) -> Double.compare(b.salary, a.salary));

        int limit = Math.min(5, employees.size());
        for (int i = 0; i < limit; i++) {
            Employee emp = employees.get(i);
            System.out.println(
                    emp.name + " - " +
                    emp.department + " - " +
                    emp.salary
            );
        }
    }
}

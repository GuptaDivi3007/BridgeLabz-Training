import java.io.*;
import java.util.*;

public class SearchEmployeeCSV {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String searchName = input.nextLine();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {
                    String department = data[2];
                    String salary = data[3];

                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    found = true;
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }
}

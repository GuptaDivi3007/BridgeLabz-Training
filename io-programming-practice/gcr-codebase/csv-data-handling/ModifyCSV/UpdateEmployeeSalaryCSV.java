import java.io.*;
import java.util.*;

public class UpdateEmployeeSalaryCSV {

    public static void main(String[] args) {
        List<String> updatedRecords = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                updatedRecords.add(id + "," + name + "," + department + "," + salary);
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("updated_employees.csv"))) {
            for (String record : updatedRecords) {
                writer.write(record);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}

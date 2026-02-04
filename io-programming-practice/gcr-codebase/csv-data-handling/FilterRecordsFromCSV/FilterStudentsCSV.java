import java.io.*;

public class FilterStudentsCSV {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                int marks = Integer.parseInt(parts[3]);

                if (marks > 80) {
                    System.out.println(
                            "ID: " + id +
                            ", Name: " + name +
                            ", Age: " + age +
                            ", Marks: " + marks
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

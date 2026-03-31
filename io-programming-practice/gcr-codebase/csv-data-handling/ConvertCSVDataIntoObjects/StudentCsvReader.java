import java.io.*;
import java.util.*;

public class StudentCsvReader {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                students.add(new Student(id, name, age, marks));
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

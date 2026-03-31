import java.io.*;
import java.util.*;

public class ReadStudentCSV {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
                System.out.println("-----");
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

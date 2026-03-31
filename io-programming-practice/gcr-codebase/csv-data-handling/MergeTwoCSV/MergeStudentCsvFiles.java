import java.io.*;
import java.util.*;

public class MergeStudentCsvFiles {

    public static void main(String[] args) {
        Map<String, String[]> studentInfo = new HashMap<>();

        try (BufferedReader reader1 = new BufferedReader(new FileReader("students1.csv"))) {
            String line = reader1.readLine();
            while ((line = reader1.readLine()) != null) {
                String[] data = line.split(",");
                studentInfo.put(data[0], new String[]{data[1], data[2]});
            }
        } catch (IOException e) {
            System.out.println("Error reading students1.csv");
            return;
        }

        try (BufferedReader reader2 = new BufferedReader(new FileReader("students2.csv"))) {
            String line = reader2.readLine();
            while ((line = reader2.readLine()) != null) {
                String[] data = line.split(",");
                if (studentInfo.containsKey(data[0])) {
                    String[] basic = studentInfo.get(data[0]);
                    System.out.println(
                            "ID: " + data[0] +
                            ", Name: " + basic[0] +
                            ", Age: " + basic[1] +
                            ", Marks: " + data[1] +
                            ", Grade: " + data[2]
                    );
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading students2.csv");
        }
    }
}

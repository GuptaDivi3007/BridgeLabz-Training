import java.io.*;
import java.util.*;

public class DetectDuplicateCsvRecords {

    public static void main(String[] args) {
        Set<String> seenIds = new HashSet<>();
        Set<String> duplicateIds = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("records.csv"))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (!seenIds.add(id)) {
                    duplicateIds.add(id);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
            return;
        }

        if (duplicateIds.isEmpty()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("records.csv"))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (duplicateIds.contains(data[0])) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

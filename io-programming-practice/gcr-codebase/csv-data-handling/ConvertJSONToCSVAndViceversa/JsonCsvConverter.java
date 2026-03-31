import java.io.*;
import java.util.*;

public class JsonCsvConverter {

    public static void main(String[] args) {
        jsonToCsv("students.json", "students.csv");
        csvToJson("students.csv", "students_converted.json");
    }

    static void jsonToCsv(String jsonFile, String csvFile) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))
        ) {
            StringBuilder json = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                json.append(line.trim());
            }

            String content = json.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replace("{", "")
                    .replace("}", "");

            String[] records = content.split("(?<=}),");

            writer.write("ID,Name,Age,Marks");
            writer.newLine();

            for (String record : records) {
                String cleaned = record.replace("\"", "");
                String[] fields = cleaned.split(",");

                String id = fields[0].split(":")[1];
                String name = fields[1].split(":")[1];
                String age = fields[2].split(":")[1];
                String marks = fields[3].split(":")[1];

                writer.write(id + "," + name + "," + age + "," + marks);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error converting JSON to CSV");
        }
    }

    static void csvToJson(String csvFile, String jsonFile) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(csvFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(jsonFile))
        ) {
            String line = reader.readLine();
            List<String> jsonObjects = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String json =
                        "{ \"id\": " + data[0] +
                        ", \"name\": \"" + data[1] +
                        "\", \"age\": " + data[2] +
                        ", \"marks\": " + data[3] + " }";

                jsonObjects.add(json);
            }

            writer.write("[");
            for (int i = 0; i < jsonObjects.size(); i++) {
                writer.write(jsonObjects.get(i));
                if (i < jsonObjects.size() - 1) {
                    writer.write(",");
                }
            }
            writer.write("]");

        } catch (IOException e) {
            System.out.println("Error converting CSV to JSON");
        }
    }
}

import java.io.*;
import java.util.*;

public class CsvEncryptDecrypt {

    public static void main(String[] args) throws Exception {
        String inputFile = "employees.csv";
        String encryptedFile = "employees_encrypted.csv";

        encryptCsv(inputFile, encryptedFile);
        String[][] decryptedData = decryptCsv(encryptedFile);

        for (String[] row : decryptedData) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void encryptCsv(String inputFile, String outputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            // Encrypt email and salary (fields 2 and 3)
            fields[2] = simpleEncrypt(fields[2]);
            fields[3] = simpleEncrypt(fields[3]);
            writer.write(String.join(",", fields));
            writer.newLine();
        }

        reader.close();
        writer.close();
    }

    public static String[][] decryptCsv(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String[]> rows = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            // Decrypt email and salary
            fields[2] = simpleDecrypt(fields[2]);
            fields[3] = simpleDecrypt(fields[3]);
            rows.add(fields);
        }

        reader.close();
        return rows.toArray(new String[0][]);
    }

    public static String simpleEncrypt(String text) {
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) arr[i] += 3;
        return new String(arr);
    }

    public static String simpleDecrypt(String text) {
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) arr[i] -= 3;
        return new String(arr);
    }
}

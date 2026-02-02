import java.io.*;

public class CountCsvRows {

    public static void main(String[] args) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("data.csv"))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                count++;
            }

            System.out.println(count);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

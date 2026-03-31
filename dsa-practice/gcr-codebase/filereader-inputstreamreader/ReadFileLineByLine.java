import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        String filePath = "sample.txt"; // path to your text file

        try (BufferedReader rd = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

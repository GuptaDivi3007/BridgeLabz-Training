import java.io.*;

public class ReadLargeFileErrors {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("largeLog.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        }
        catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
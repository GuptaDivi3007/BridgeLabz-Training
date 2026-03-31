import java.io.*;
import java.nio.charset.StandardCharsets;

public class LargeFileWordCount {

    public static void main(String[] args) {

        String filePath = "sample.txt"; // assume large file
        countUsingFileReader(filePath);
        countUsingInputStreamReader(filePath);
    }

    // Using FileReader
    
    private static void countUsingFileReader(String filePath) {
        long start = System.currentTimeMillis();
        long wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                wordCount += words.length;
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        long end = System.currentTimeMillis();
        System.out.println(
            "FileReader -> Words: " + wordCount +
            ", Time: " + (end - start) + " ms"
        );
    }

    // Using InputStreamReader
    private static void countUsingInputStreamReader(String filePath) {
        long start = System.currentTimeMillis();
        long wordCount = 0;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(filePath),
                    StandardCharsets.UTF_8
                )
            )
        ) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                wordCount += words.length;
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        long end = System.currentTimeMillis();
        System.out.println(
            "InputStreamReader -> Words: " + wordCount +
            ", Time: " + (end - start) + " ms"
        );
    }
}

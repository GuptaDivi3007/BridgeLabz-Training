import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderTest {

    public static void main(String[] args) {

        String filePath = "largeFile.txt";
        long start = System.currentTimeMillis();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(filePath),
                    StandardCharsets.UTF_8))) {

            while (reader.readLine() != null) {
                // reading line by line
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        long end = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }
}

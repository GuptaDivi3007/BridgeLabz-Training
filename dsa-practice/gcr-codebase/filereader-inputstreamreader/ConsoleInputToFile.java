import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleInputToFile {

    public static void main(String[] args) {

        String filePath = "userInput.txt";

        try (
            BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(filePath, true)
        ) {

            String input;
            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                input = reader.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(input + System.lineSeparator());
            }

            System.out.println("Input saved to file successfully.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

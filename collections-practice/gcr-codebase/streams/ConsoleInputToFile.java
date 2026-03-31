import java.io.*;

public class ConsoleInputToFile {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("userData.txt")) {

            System.out.print("Enter Name: ");
            String name = reader.readLine();

            System.out.print("Enter Age: ");
            String age = reader.readLine();

            System.out.print("Enter Favorite Language: ");
            String lang = reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Language: " + lang);

            System.out.println("Data saved.");

        }
        catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
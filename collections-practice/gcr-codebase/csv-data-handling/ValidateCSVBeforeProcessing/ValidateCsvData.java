import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ValidateCsvData {

    public static void main(String[] args) {
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("\\d{10}");

        try (BufferedReader reader = new BufferedReader(new FileReader("contacts.csv"))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                String email = data[1];
                String phone = data[2];

                boolean emailValid = emailPattern.matcher(email).matches();
                boolean phoneValid = phonePattern.matcher(phone).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println("Invalid record: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

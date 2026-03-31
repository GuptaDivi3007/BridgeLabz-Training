import java.io.*;

public class WriteEmployeeCSV {

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.csv"))) {

            writer.write("1,Alice,HR,45000");
            writer.newLine();
            writer.write("2,Bob,IT,60000");
            writer.newLine();
            writer.write("3,Charlie,Finance,55000");
            writer.newLine();
            writer.write("4,Diana,Marketing,50000");
            writer.newLine();
            writer.write("5,Edward,Operations,48000");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}

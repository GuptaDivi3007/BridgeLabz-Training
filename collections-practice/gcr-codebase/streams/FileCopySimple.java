import java.io.*;

public class FileCopySimple {

    public static void main(String[] args) {

        String source = "source.txt";
        String dest = "destination.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        }
        catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        }
        catch (IOException e) {
            System.out.println("IO Error occurred.");
        }
    }
}
import java.io.*;

public class ImageToByteArray {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("image.jpg");
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            int data;
            while ((data = fis.read()) != -1) {
                baos.write(data);
            }

            byte[] imageBytes = baos.toByteArray();

            try (FileOutputStream fos = new FileOutputStream("copy.jpg")) {
                fos.write(imageBytes);
            }

            System.out.println("Image copied successfully.");

        }
        catch (IOException e) {
            System.out.println("Error processing image.");
        }
    }
}
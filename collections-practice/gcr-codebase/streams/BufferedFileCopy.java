import java.io.*;

public class BufferedFileCopy {

    public static void main(String[] args) {

        String source = "largeFile.txt";
        String dest = "copy.txt";
        byte[] buffer = new byte[4096];

        try {
            long start = System.nanoTime();

            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
            }

            long end = System.nanoTime();
            System.out.println("Buffered copy time: " + (end - start));

        }
        catch (IOException e) {
            System.out.println("Error copying file.");
        }
    }
}
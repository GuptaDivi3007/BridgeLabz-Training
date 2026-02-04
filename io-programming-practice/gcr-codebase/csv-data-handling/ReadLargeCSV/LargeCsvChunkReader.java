import java.io.*;

public class LargeCsvChunkReader {

    public static void main(String[] args) {
        int processedCount = 0;
        int batchSize = 100;

        try (BufferedReader reader = new BufferedReader(new FileReader("large_data.csv"))) {
            String line;
            int currentBatchCount = 0;

            reader.readLine();

            while ((line = reader.readLine()) != null) {
                currentBatchCount++;
                processedCount++;

                if (currentBatchCount == batchSize) {
                    System.out.println("Records processed so far: " + processedCount);
                    currentBatchCount = 0;
                }
            }

            if (currentBatchCount > 0) {
                System.out.println("Records processed so far: " + processedCount);
            }

        } catch (IOException e) {
            System.out.println("Error reading large CSV file");
        }
    }
}

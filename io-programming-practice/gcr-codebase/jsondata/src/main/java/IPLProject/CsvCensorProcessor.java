package IPLProject;
import com.opencsv.*;
import java.io.*;
import java.util.List;
public class CsvCensorProcessor {
	public static void processCsv() {
		String inputFile = "src/main/resources/ipl_input.csv";
        String outputFile = "src/main/resources/ipl_censored.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {

                // Header 그대로 copy
                if (firstLine) {
                    bw.write(line);
                    bw.newLine();
                    firstLine = false;
                    continue;
                }

                String[] data = line.split(",");

                // Safety check
                if (data.length < 7) continue;

                // CENSOR RULES
                data[1] = maskTeam(data[1]);
                data[2] = maskTeam(data[2]);
                data[5] = maskTeam(data[5]);
                data[6] = "REDACTED";

                bw.write(String.join(",", data));
                bw.newLine();
            }

            System.out.println("Censored CSV file created successfully");

        } catch (Exception e) {
            System.out.println("Error while processing CSV");
            e.printStackTrace();
        }
    }

    private static String maskTeam(String team) {
        String[] parts = team.split(" ");
        if (parts.length > 1) {
            return parts[0] + " ***";
        }
        return "***";
    }
}

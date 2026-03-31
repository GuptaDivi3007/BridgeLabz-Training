package IPLProject;

public class Main {
	public static void main(String[] args) {

        try {
            JsonCensorProcessor.processJson();
            CsvCensorProcessor.processCsv();
            System.out.println("IPL Censorship Completed Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

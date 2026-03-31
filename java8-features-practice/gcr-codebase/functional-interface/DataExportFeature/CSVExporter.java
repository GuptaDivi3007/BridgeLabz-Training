package DataExportFeature;

public class CSVExporter implements DataExporter{
	@Override
    public void export(String data) {
        System.out.println("Exporting data to CSV format");
        System.out.println("CSV: " + data);
    }
}

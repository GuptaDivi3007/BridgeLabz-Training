package DataExportFeature;

public class Main {
	public static void main(String[] args) {

        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();
        DataExporter json = new AdvancedJSONExporter();

        csv.export("Sales Report 2026");
        csv.exportToJSON("Sales Report 2026");

        pdf.export("Inventory Report 2026");
        pdf.exportToJSON("Inventory Report 2026");

        json.export("Finance Report 2026");
        json.exportToJSON("Finance Report 2026");
    }
}

package DataExportFeature;

public class PDFExporter implements DataExporter{
	@Override
    public void export(String data) {
        System.out.println("Exporting data to PDF format");
        System.out.println("PDF Content: " + data);
    }
}

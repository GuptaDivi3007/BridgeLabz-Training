package DataExportFeature;

public class AdvancedJSONExporter implements DataExporter{
	@Override
    public void export(String data) {
        System.out.println("Exporting data using Advanced JSON Exporter");
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Exporting data to JSON (custom implementation)");
        System.out.println("{ \"report\": \"" + data + "\", \"status\": \"success\" }");
    }
}

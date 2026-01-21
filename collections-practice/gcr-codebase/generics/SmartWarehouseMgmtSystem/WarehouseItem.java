public abstract class WarehouseItem {

    private final String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract String getCategory();
}

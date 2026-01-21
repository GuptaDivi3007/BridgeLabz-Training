import java.util.*;

public class Main {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));

        WarehouseUtil.displayItems(electronicsStorage.getAllItems());
        WarehouseUtil.displayItems(groceriesStorage.getAllItems());
        WarehouseUtil.displayItems(furnitureStorage.getAllItems());
    }
}

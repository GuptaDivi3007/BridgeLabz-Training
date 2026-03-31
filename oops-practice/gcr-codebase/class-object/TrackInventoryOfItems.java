import java.util.*;

public class TrackInventoryOfItems {

    public static void main(String[] args) {
        Item one = new Item("01AA", "Water bottle", 500.0);
        Item two = new Item("01BB", "Rice", 700.0);
        Item three = new Item("02AA", "blackboard", 400.0);

        one.show();
        System.out.println("----------------------------");
        two.show();
        System.out.println("----------------------------");
        three.show();
        System.out.println("----------------------------");
    }
}

class Item {
    String itemCode;
    String itemName;
    double itemPrice;

    Item(String itemCode, String itemName, double itemPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    void show() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + itemPrice);
        System.out.println("itemName : " + itemName);
    }
}

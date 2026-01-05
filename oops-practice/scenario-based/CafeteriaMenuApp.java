import java.util.*;

public class CafeteriaMenuApp {

    static void displayMenu(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " : " + items[i]);
        }
    }

    static String getItemByIndex(String[] items, int index) {
        if (index < 0 || index >= items.length) {
            return null;
        }
        return items[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menuItems = {
            "Veg Sandwich",
            "Chicken Burger",
            "French Fries",
            "Pasta",
            "Fried Rice",
            "Noodles",
            "Coffee",
            "Tea",
            "Fruit Juice",
            "Ice Cream"
        };

        displayMenu(menuItems);

        System.out.print("Select item index: ");
        int choice = sc.nextInt();

        String selectedItem = getItemByIndex(menuItems, choice);

        if (selectedItem != null) {
            System.out.println("You selected: " + selectedItem);
        }
        else {
            System.out.println("Invalid selection");
        }
    }
}

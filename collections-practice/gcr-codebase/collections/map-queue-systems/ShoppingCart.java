import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Apple", 50);
        priceMap.put("Banana", 20);
        priceMap.put("Milk", 40);

        LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Milk", priceMap.get("Milk"));
        cart.put("Apple", priceMap.get("Apple"));
        cart.put("Banana", priceMap.get("Banana"));

        System.out.println("Cart (Insertion Order): " + cart);

        TreeMap<Integer, String> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Items Sorted By Price: " + sortedByPrice);
    }
}
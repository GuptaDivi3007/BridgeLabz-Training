import java.util.*;

public class EventManager {
    
	public static void sortPrices(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] getTopCheapest(int[] arr, int n) {
        return Arrays.copyOfRange(arr, 0, Math.min(n, arr.length));
    }
   
    public static int[] getTopExpensive(int[] arr, int n) {
        return Arrays.copyOfRange(arr, Math.max(0, arr.length - n), arr.length);
    }

    public static void main(String[] args) {
        int[] prices = {4500, 1200, 3000, 800, 2000, 5000, 700, 1500};

        System.out.println("Original Prices: " + Arrays.toString(prices));

        sortPrices(prices);

        System.out.println("Sorted Prices (ascending): " + Arrays.toString(prices));

        int[] cheapest = getTopCheapest(prices, 3);
        System.out.println("Top 3 Cheapest Tickets: " + Arrays.toString(cheapest));

        int[] expensive = getTopExpensive(prices, 3);
        System.out.println("Top 3 Most Expensive Tickets: " + Arrays.toString(expensive));
    }
}

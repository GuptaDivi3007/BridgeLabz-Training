import java.util.*;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int size = 1_000_000;
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = i;
        }

        int target = size - 1;

        long start = System.currentTimeMillis();
        linearSearch(data, target);
        System.out.println("Linear Search Time: " + (System.currentTimeMillis() - start) + " ms");

        Arrays.sort(data);

        start = System.currentTimeMillis();
        binarySearch(data, target);
        System.out.println("Binary Search Time: " + (System.currentTimeMillis() - start) + " ms");
    }
}

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> prefixMap = new HashMap<>();
        int sum = 0;

        prefixMap.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (prefixMap.containsKey(sum)) {
                for (int start : prefixMap.get(sum)) {
                    System.out.println("Zero sum subarray from index " + (start + 1) + " to " + i);
                }
            }

            prefixMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 2, -1, 1, -2};
        findZeroSumSubarrays(arr);
    }
}
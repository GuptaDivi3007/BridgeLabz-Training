import java.util.*;

public class TwoSum {

    public static int[] findIndices(int[] arr, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];
            if (indexMap.containsKey(required)) {
                return new int[]{indexMap.get(required), i};
            }
            indexMap.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] result = findIndices(arr, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}
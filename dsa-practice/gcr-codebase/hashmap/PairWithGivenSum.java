import java.util.*;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> visited = new HashSet<>();

        for (int value : arr) {
            int needed = target - value;
            if (visited.contains(needed)) {
                return true;
            }
            visited.add(value);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        System.out.println(hasPair(arr, 10));
    }
}
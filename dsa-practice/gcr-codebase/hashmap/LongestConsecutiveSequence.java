import java.util.*;

public class LongestConsecutiveSequence {

    public static int findLongest(int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : arr) {
            numbers.add(num);
        }

        int longest = 0;

        for (int num : arr) {
            if (!numbers.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (numbers.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongest(arr));
    }
}
import java.util.*;

public class MissingPositiveAndBinarySearch {

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};
        int target = 4;

        int missing = firstMissingPositive(nums.clone());
        System.out.println("First Missing Positive: " + missing);

        Arrays.sort(nums);
        int index = binarySearch(nums, target);
        System.out.println("Index of target: " + index);
    }

    static int firstMissingPositive(int[] nums) {

        int n = nums.length;
        boolean[] visited = new boolean[n + 1];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return n + 1;
    }
 
    static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

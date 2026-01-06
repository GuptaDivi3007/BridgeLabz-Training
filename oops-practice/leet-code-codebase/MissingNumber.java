import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        int result = missingNumber(nums);
        System.out.println(result);
    }

    public static int missingNumber(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < nums.length; i++) {
            x += i - nums[i];
        }
        return x;
    }
}

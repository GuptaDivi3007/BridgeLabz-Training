import java.util.*;

public class RotationPointInARotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 1, 2, 3};

        int index = findIndex(nums);
        System.out.println(index);  // 4
    }

    static int findIndex(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left; 
    }
}

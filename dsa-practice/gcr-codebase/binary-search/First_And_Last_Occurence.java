import java.util.*;

public class First_And_Last_Occurence {

    public static void main(String[] args) {

        int[] nums = {0 , 1, 2, 3, 4, 5, 6, 7, 7};

        int[] ans = search(nums, 7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = findIndex(nums, target, true);    
        ans[1] = findIndex(nums, target, false);  

        return ans;
    }

    static int findIndex(int[] nums, int target, boolean findFirst) {

        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (findFirst)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return index;
    }
}

import java.util.*;

public class PeakElements {
     
    public static void main(String[] args) {

        int[] nums = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(nums);

        if (peakIndex != -1){
            System.out.println("Peak index: " + peakIndex + ", Peak value: " + nums[peakIndex]);
        }
        else{
            System.out.println("No Peak Element");
        }
    }

    static int findPeakElement(int[] nums) {

        int n = nums.length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // check boundaries safely
            boolean leftOk  = (mid == 0) || (nums[mid] > nums[mid - 1]);
            boolean rightOk = (mid == n - 1) || (nums[mid] > nums[mid + 1]);

            if (leftOk && rightOk) {
                return mid;
            }

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

import java.util.*;

public class FirstNegNumber {

    public static void main(String[] args) {

        int[] nums = {1, 4, 7, 10, -3, 8, -1};
        int ans = linearSearch(nums);

        if (ans != -1) {
            System.out.println("First negative number index is " + ans);
        }
        else {
            System.out.println("No negative number found");
        }
    }

    static int linearSearch(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                return i;    
            }
        }
        return -1;  
    }
}
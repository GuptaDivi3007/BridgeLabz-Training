import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = TwoSum(nums, target);

        System.out.print(result[0] + " " + result[1]);
    }
    
    public static int[] TwoSum(int[] nums, int target){
        int n = nums.length;
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                if (nums[i] + nums[j + 1] == target) {
                    ans[0] = i;
                    ans[1] = j + 1;
                }
            }
        }

        return ans;
    }
}

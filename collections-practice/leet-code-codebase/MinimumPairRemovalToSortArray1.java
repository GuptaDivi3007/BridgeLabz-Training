import java.util.*;

public class MinimumPairRemovalToSortArray1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(minimumPairRemoval(nums));
    }

    public static int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        int ans = 0;

        while (!isSorted(list)) {

            int minSum = Integer.MAX_VALUE;
            int idx = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            list.remove(idx);
            list.remove(idx);
            list.add(idx, minSum);

            ans++;
        }

        return ans;
    }

    public static boolean isSorted(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

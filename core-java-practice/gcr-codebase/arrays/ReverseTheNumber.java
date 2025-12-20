import java.util.*;

public class ReverseTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digit = new int[count];
        int idx = 0;

        while (n != 0) {
            digit[idx] = n % 10;
            n = n / 10;
            idx++;
        }

        int[] ans = new int[count];
        int revIdx = 0;

        for (int i = digit.length - 1; i >= 0; i--) {
            ans[revIdx] = digit[i];
            revIdx++;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

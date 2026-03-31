import java.util.*;

public class MultiplicationTableFromSixToNine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[4];

        int idx = 0;
        for (int i = 6; i <= 9; i++) {
            ans[idx] = n * i;
            idx++;
        }

        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + ans[idx]);
            idx++;
        }
    }
}

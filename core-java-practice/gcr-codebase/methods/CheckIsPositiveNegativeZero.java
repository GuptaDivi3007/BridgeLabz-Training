import java.util.*;

public class CheckIsPositiveNegativeZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = checkNumber(n);
        System.out.println(ans);
    }

    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        }
        else if (number < 0) {
            return -1;
        }
        return 0;
    }
}

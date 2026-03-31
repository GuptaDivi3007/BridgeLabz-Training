import java.util.*;

public class FactorsOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[idx] = i;
                idx++;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.println(factors[i]);
        }
    }
}

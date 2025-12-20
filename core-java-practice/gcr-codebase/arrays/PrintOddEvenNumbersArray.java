import java.util.*;

public class PrintOddEvenNumbersArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error");
            return;
        }

        int[] even = new int[n / 2 + 1];
        int[] odd = new int[n / 2 + 1];

        int evenIdx = 0;
        int oddIdx = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[evenIdx] = i;
                evenIdx++;
            }
            else {
                odd[oddIdx] = i;
                oddIdx++;
            }
        }

        for (int i = 0; i < oddIdx; i++) {
            System.out.println(odd[i]);
        }

        for (int i = 0; i < evenIdx; i++) {
            System.out.println(even[i]);
        }
    }
}

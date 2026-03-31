import java.util.*;

public class LargestAndSecondLargestElementInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxDigit = 10;
        int[] dig = new int[maxDigit];
        int idx = 0;

        while (n != 0 && idx < maxDigit) {
            dig[idx] = n % 10;
            n = n / 10;
            idx++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < idx; i++) {
            if (dig[i] > largest) {
                secondLargest = largest;
                largest = dig[i];
            }
            else if (dig[i] > secondLargest && dig[i] != largest) {
                secondLargest = dig[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
}

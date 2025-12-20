import java.util.*;

public class LargestAndSecondLargestElementInArrayEnhanced {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDigit = 10;
        int[] digit = new int[maxDigit];
        int idx = 0;

        while (n != 0) {
            if (idx == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digit.length; i++) {
                    temp[i] = digit[i];
                }
                digit = temp;
            }

            digit[idx] = n % 10;
            n = n / 10;
            idx++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < idx; i++) {
            if (digit[i] > largest) {
                secondLargest = largest;
                largest = digit[i];
            }
            else if (digit[i] > secondLargest && digit[i] != largest) {
                secondLargest = digit[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
}

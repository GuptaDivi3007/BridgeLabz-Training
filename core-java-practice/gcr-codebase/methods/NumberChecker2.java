import java.util.*;

public class NumberChecker2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] digits = storeDigits(n);

        System.out.println("Count of digits: " + countDigits(n));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(n, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }

    public static int countDigits(int n) {
        int count = 0;
        int temp = Math.abs(n);

        if (temp == 0) return 1;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int temp = Math.abs(n);
        int size = countDigits(temp);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int n, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;
        return n % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
}

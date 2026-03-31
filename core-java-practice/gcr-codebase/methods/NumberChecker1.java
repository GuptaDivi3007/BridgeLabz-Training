import java.util.*;

public class NumberChecker1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digitCount = countDigits(n);
        int[] digits = storeDigits(n, digitCount);

        System.out.println("Digit Count: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(n, digits));

        int[] largest = findLargestAndSecondLargest(digits);
        int[] smallest = findSmallestAndSecondSmallest(digits);

        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int n, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == n;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            }
            else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            }
            else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}

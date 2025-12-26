import java.util.*;

public class NumberIsPositiveOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " is positive and even");
                }
                else {
                    System.out.println(arr[i] + " is positive and odd");
                }
            }
            else {
                System.out.println(arr[i] + " is negative");
            }
        }

        int comparison = compare(arr[0], arr[4]);
        if (comparison == 1) {
            System.out.println("First element is greater than last element");
        }
        else if (comparison == 0) {
            System.out.println("First element is equal to last element");
        }
        else {
            System.out.println("First element is less than last element");
        }
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        }
        else if (number1 == number2) {
            return 0;
        }
        else {
            return -1;
        }
    }
}

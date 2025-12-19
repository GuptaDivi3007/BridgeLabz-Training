import java.util.*;

public class LeapYearOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // Check valid Gregorian year
        if (year < 1582) {
            System.out.println("Year must be >= 1582");
            return;
        }

        if (year % 4 != 0) {
            System.out.println(year + " is not a Leap Year");
        }
        else if (year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        }
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year (checked with single if)");
        }
        else {
            System.out.println(year + " is not a Leap Year (checked with single if)");
        }
    }
}

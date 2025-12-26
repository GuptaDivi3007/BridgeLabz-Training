import java.util.*;

public class IsLeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeap = checkLeapYear(year);

        if (isLeap) {
            System.out.println("Year is a Leap Year");
        }
        else {
            System.out.println("Year is not a Leap Year");
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

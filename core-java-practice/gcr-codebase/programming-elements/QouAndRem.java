import java.util.*;

public class QuoAndRem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int qou = n1 / n2;
        int rem = n1 % n2;
        System.out.println("The Quotient is " + qou + " and Reminder is " + rem + " of two number " + n1 + " and " + n2);
    }
}

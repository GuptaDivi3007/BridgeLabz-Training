import java.util.*;

public class ConvertHeight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();

        double totalIn = heightCm / 2.54;
        int feet = (int) (totalIn / 12);
        double inches = totalIn % 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}

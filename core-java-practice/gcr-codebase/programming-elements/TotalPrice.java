import java.util.*;

public class TotalPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        int q = sc.nextInt();

        double total = unit * q;
        System.out.println("The total purchase price is INR " + total + " if the q " + q + " and unit price is INR " + unit);
    }
}

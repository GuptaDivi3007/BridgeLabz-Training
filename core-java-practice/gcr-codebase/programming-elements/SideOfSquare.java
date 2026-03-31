import java.util.*;

public class SideOfSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peri = sc.nextDouble();

        double side = peri / 4;

        System.out.println("The length of the side is " + side + " whose peri is " + peri);
    }
}

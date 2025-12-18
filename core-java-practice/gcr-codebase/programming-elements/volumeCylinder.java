import java.util.*;

public class volumeCylinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double vol = 3.14 * r * r * h;
        System.out.println(vol);
    }
}

import java.util.*;

public class PerimeterOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double peri = 2 * (l + b);
        System.out.print("Perimeter of the rectangle: " + peri);
    }
}

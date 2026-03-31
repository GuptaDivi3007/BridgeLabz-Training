import java.util.*;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double areaCm = 0.5 * b * h;

        // Convert sq cm to sq inches (1 in = 2.54 cm)
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }
}

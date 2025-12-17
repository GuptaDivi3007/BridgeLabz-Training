import java.util.*;

public class perimeterOfARectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double len = sc.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double bre = sc.nextDouble();
        double peri = 2 * (len + bre);
        System.out.println("Perimeter of the rectangle: " + peri);
    }
}
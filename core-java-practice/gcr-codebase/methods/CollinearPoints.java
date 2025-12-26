import java.util.*;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeRes = checkUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaRes = checkUsingArea(x1, y1, x2, y2, x3, y3);

        if (slopeRes && areaRes) {
            System.out.println("Points are collinear");
        }
        else {
            System.out.println("Points are not collinear");
        }
    }

    public static boolean checkUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0) {
            return (x1 == x2 && x2 == x3);
        }

        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean checkUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}

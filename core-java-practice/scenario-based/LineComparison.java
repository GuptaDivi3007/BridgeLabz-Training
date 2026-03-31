import java.util.*;

public class LineComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Write the (x1, y1) coordinates of line 1:");
        int line1X1 = scanner.nextInt();
        int line1Y1 = scanner.nextInt();

        System.out.println("Write the (x2, y2) coordinates of line 1:");
        int line1X2 = scanner.nextInt();
        int line1Y2 = scanner.nextInt();

        System.out.println("Write the (x1, y1) coordinates of line 2:");
        int line2X1 = scanner.nextInt();
        int line2Y1 = scanner.nextInt();

        System.out.println("Write the (x2, y2) coordinates of line 2:");
        int line2X2 = scanner.nextInt();
        int line2Y2 = scanner.nextInt();



        // Use Case 1: Calculate line lengths

        int line1Length = calculateLength(line1X1, line1Y1, line1X2, line1Y2);
        int line2Length = calculateLength(line2X1, line2Y1, line2X2, line2Y2);

        System.out.println("The length of line 1 is: " + line1Length);
        System.out.println("The length of line 2 is: " + line2Length);


        // Use Case 2: Check the equality

        if (line1Length == line2Length) {
            System.out.println("Both line 1 and line 2 are equal");
        }


        // Use Case 3: Check if the line are not equal than it is greater or lesser than other line

        else if (line1Length > line2Length) {
            System.out.println("Line 1 is greater than line 2");
        }
        else {
            System.out.println("Line 1 is lesser than line 2");
        }
    }


    public static int calculateLength(int x1, int y1, int x2, int y2) {

        int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }
}

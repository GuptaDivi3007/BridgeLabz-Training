import java.util.*;

public class NestedTryCatchBlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int divisor = sc.nextInt();

        try {
            try {
                int result = values[index] / divisor;
                System.out.println(result);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}

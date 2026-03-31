import java.util.*;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = null;

        if (size > 0) {
            numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
        }

        int index = sc.nextInt();

        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

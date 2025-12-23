import java.util.*;

public class ArrayIndexOutOfBoundException {

    static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        try {
            generateException(names);
        }
        catch (RuntimeException e) {
            System.out.println("Error occurred");
        }

        handleException(names);
    }
}

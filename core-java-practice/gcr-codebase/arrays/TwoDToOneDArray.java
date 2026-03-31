import java.util.*;

public class TwoDToOneDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr2D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        int[] arr1D = new int[rows * cols];
        int idx = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1D[idx] = arr2D[i][j];
                idx++;
            }
        }

        for (int i = 0; i < arr1D.length; i++) {
            System.out.println(arr1D[i]);
        }
    }
}

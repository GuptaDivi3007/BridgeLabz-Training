import java.util.*;

public class AddSubMulOfMatrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        printMatrix(matrixA);
        printMatrix(matrixB);

        printMatrix(addMatrices(matrixA, matrixB));
        printMatrix(subtractMatrices(matrixA, matrixB));

        int[][] matrixC = createRandomMatrix(cols, rows);
        printMatrix(multiplyMatrices(matrixA, matrixC));
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int cols = first[0].length;
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = first[i][j] + second[i][j];
            }
        }
        return ans;
    }

    public static int[][] subtractMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int cols = first[0].length;
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = first[i][j] - second[i][j];
            }
        }
        return ans;
    }

    public static int[][] multiplyMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int cols = second[0].length;
        int common = second.length;
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < common; k++) {
                    sum += first[i][k] * second[k][j];
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

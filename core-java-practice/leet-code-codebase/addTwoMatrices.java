import java.util.*;

public class addTwoMatrices{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [][]matrix1=new int[2][3];
        int [][]matrix2=new int[2][3];
        System.out.println("enter the elements in matrix1 :");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix1[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the elements in matrix2 :");
        for(int i=0;i<2;i++) {
            for (int j=0;j<3;j++) {
                matrix2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<2;i++) {
            for (int j=0;j<3;j++) {
                matrix1[i][j]=matrix1[i][j]+matrix2[i][j];

            }
        }
        System.out.println("sum of two matrices are :");
        for(int i=0;i<2;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
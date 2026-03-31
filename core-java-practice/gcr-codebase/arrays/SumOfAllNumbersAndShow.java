import java.util.*;

public class SumOfAllNumbersAndShow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0.0;
        int idx = 0;

        while (true) {
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }
            if (idx == 10) {
                break;
            }

            arr[idx] = value;
            idx++;
        }

        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

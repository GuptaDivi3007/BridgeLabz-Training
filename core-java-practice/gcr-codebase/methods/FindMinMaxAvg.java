import java.util.*;

public class FindMinMaxAvg {

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

        System.out.println("Generated numbers: " + Arrays.toString(numbers));

        double[] ans = findAvgMinMax(numbers);
        System.out.println("Average: " + ans[0]);
        System.out.println("Minimum: " + ans[1]);
        System.out.println("Maximum: " + ans[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (1000 + Math.random() * 9000); // 4-digit number
        }
        return array;
    }

    public static double[] findAvgMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }
}

import java.util.*;

public class RandomArrayStats {

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

        System.out.println("Generated numbers: " + Arrays.toString(numbers));

        double[] stats = findAverageMinMax(numbers);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (1000 + Math.random() * 9000); // 4-digit number
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
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

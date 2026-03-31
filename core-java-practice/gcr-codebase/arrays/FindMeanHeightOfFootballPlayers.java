import java.util.*;

public class FindMeanHeightOfFootballPlayers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0.0;

        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }

        double mean = sum / height.length;
        System.out.println(mean);
    }
}

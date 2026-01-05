import java.util.*;

public class StudentScoreManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = 0;

        while (true) {
            try {
                studentCount = Integer.parseInt(sc.nextLine());
                if (studentCount > 0) {
                    break;
                }
            }
            catch (Exception e) {

            }
        }

        double[] scores = new double[studentCount];
        int idx = 0;

        while (idx < studentCount) {
            try {
                double value = Double.parseDouble(sc.nextLine());
                if (value >= 0) {
                    scores[idx] = value;
                    idx++;
                }
            }
            catch (Exception e) {
                
            }
        }

        double sum = 0;
        double highest = scores[0];
        double lowest = scores[0];

        for (double score : scores) {
            sum += score;
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        double average = sum / studentCount;

        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Scores Above Average:");

        for (double score : scores) {
            if (score > average) {
                System.out.println(score);
            }
        }
    }
}

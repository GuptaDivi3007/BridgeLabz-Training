import java.util.*;

public class StudentScoreAnalyzer {

    static class InvalidScoreException extends Exception {
        InvalidScoreException(String message) {
            super(message);
        }
    }

    static double calculateAverage(int[] scores) throws InvalidScoreException {
        int sum = 0;
        for (int score : scores) {
            validateScore(score);
            sum += score;
        }
        return (double) sum / scores.length;
    }

    static int findMax(int[] scores) throws InvalidScoreException {
        int max = scores[0];
        for (int score : scores) {
            validateScore(score);
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    static int findMin(int[] scores) throws InvalidScoreException {
        int min = scores[0];
        for (int score : scores) {
            validateScore(score);
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Invalid score found: " + score);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        try {
            System.out.println("Average Score: " + calculateAverage(scores));
            System.out.println("Highest Score: " + findMax(scores));
            System.out.println("Lowest Score: " + findMin(scores));
        }
        catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}

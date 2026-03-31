import java.util.*;

public class CalculateTotalAvgPercentage {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStudent = sc.nextInt();

        int[][] scores = generateScores(noOfStudent);
        double[][] ans = calculateResults(scores);

        displayScorecard(scores, ans);
    }

    public static int[][] generateScores(int noOfStudent) {
        int[][] scores = new int[noOfStudent][3];
        Random random = new Random();

        for (int i = 0; i < noOfStudent; i++) {
            scores[i][0] = 10 + random.nextInt(90);
            scores[i][1] = 10 + random.nextInt(90);
            scores[i][2] = 10 + random.nextInt(90);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] ans = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            ans[i][0] = Math.round(total * 100.0) / 100.0;
            ans[i][1] = Math.round(avg * 100.0) / 100.0;
            ans[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return ans;
    }

    public static String findGrade(double percentage) {
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        if (percentage >= 40) return "E";
        return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] ans) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            String grade = findGrade(ans[i][2]);

            System.out.println(
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                ans[i][0] + "\t" +
                ans[i][1] + "\t" +
                ans[i][2] + "\t" +
                grade
            );
        }
    }
}

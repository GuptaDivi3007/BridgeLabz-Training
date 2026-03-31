import java.util.*;

public class ComputePercentageAndGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] pcm = generatePCM(n);
        double[][] stats = calculateStats(pcm);
        String[] grades = calculateGrades(stats);

        displayScoreCard(pcm, stats, grades);
    }

    static int[][] generatePCM(int n) {
        int[][] pcm = new int[n][3];

        for (int i = 0; i < n; i++) {
            pcm[i][0] = (int) (Math.random() * 90) + 10;
            pcm[i][1] = (int) (Math.random() * 90) + 10;
            pcm[i][2] = (int) (Math.random() * 90) + 10;
        }
        return pcm;
    }

    static double[][] calculateStats(int[][] pcm) {
        double[][] stats = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];

            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    static void displayScoreCard(int[][] pcm, double[][] stats, String[] grades) {
        System.out.println(
            "Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade"
        );

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                pcm[i][0] + "\t" +
                pcm[i][1] + "\t" +
                pcm[i][2] + "\t" +
                (int) stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2] + "\t" +
                grades[i]
            );
        }
    }
}

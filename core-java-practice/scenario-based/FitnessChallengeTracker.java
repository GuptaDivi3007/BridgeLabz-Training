import java.util.*;

public class FitnessChallengeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] countPushUps = new int[7];
        for (int i = 0; i < countPushUps.length; i++) {
            countPushUps[i] = sc.nextInt();
        }

        int total = 0;
        int activeDays = 0;

        for (int count : countPushUps) {
            if (count == 0) {
                continue;
            }
            total += count;
            activeDays++;
        }

        double avg = activeDays == 0 ? 0 : (double) total / activeDays;

        System.out.println(total);
        System.out.println(avg);
    }
}

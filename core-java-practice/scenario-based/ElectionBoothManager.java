import java.util.*;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] voteCount = new int[4];

        while (true) {
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (isEligible(age)) {
                int choice = sc.nextInt();
                recordVote(choice, voteCount);
            }
        }

        displayResults(voteCount);
    }

    public static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void recordVote(int choice, int[] votes) {
        if (choice >= 1 && choice <= 3) {
            votes[choice]++;
        }
    }

    public static void displayResults(int[] votes) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(votes[i]);
        }
    }
}

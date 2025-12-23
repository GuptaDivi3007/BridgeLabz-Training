import java.util.*;

public class CanVote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 10;

        int[] ages = generateAges(students);
        String[][] ans = checkVoting(ages);

        displayTable(ans);
    }

    static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = r.nextInt(90); 
        }
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] ans = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            ans[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                ans[i][1] = "false";
            }
            else if (ages[i] >= 18) {
                ans[i][1] = "true";
            }
            else {
                ans[i][1] = "false";
            }
        }
        return ans;
    }

    static void displayTable(String[][] data) {
        System.out.println("Age\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                Integer.parseInt(data[i][0]) + "\t" + Boolean.parseBoolean(data[i][1])
            );
        }
    }
}

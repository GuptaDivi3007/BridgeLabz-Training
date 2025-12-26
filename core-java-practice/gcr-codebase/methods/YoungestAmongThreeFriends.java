import java.util.*;

public class YoungestAmongThreeFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        int youngestIdx = findYoungest(ages);
        int tallestIdx = findTallest(heights);

        System.out.println("Youngest friend: " + names[youngestIdx]);
        System.out.println("Tallest friend: " + names[tallestIdx]);
    }

    public static int findYoungest(int[] ages) {
        int minIdx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int findTallest(double[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}

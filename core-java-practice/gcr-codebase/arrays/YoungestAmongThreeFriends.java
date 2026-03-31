import java.util.*;

public class YoungestAmongThreeFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngestIdx = 0;
        int tallestIdx = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIdx]) {
                youngestIdx = i;
            }
            if (height[i] > height[tallestIdx]) {
                tallestIdx = i;
            }
        }

        System.out.println(name[youngestIdx]);
        System.out.println(name[tallestIdx]);
    }
}

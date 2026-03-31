import java.util.*;

public class CharacterFrequencyUsingCharAt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] ans = findFrequency(text);
        display(ans);
    }

    static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }

        String[][] ans = new String[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);

            if (freq[ascii] < 0) {
                ans[index][0] = String.valueOf((char) ascii);
                ans[index][1] = String.valueOf(-freq[ascii]);
                freq[ascii] = 0;
                index++;
            }
        }
        return ans;
    }

    static void display(String[][] data) {
        System.out.println("Character\tFrequency");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + Integer.parseInt(data[i][1]));
        }
    }
}

import java.util.*;

public class CharacterFrequencyUsingNested {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] ans = findFrequency(text);

        System.out.println("Character  Frequency");

        for (int i = 0; i < ans.length; i += 2) {
            System.out.println(ans[i] + "\t\t" + Integer.parseInt(ans[i + 1]));
        }
    }

    static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;

            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] ans = new String[count * 2];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                ans[index++] = String.valueOf(chars[i]);
                ans[index++] = String.valueOf(freq[i]);
            }
        }

        return ans;
    }
}

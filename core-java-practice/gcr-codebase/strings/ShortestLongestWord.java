import java.util.*;

public class ShortestLongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitManually(text);
        String[][] table = buildWordLengthTable(words);
        int[] ans = findShortestAndLongest(table);

        System.out.println("Shortest length: " + ans[0]);
        System.out.println("Longest length: " + ans[1]);

        System.out.println("Shortest words:");
        for (int i = 0; i < table.length; i++) {
            if (Integer.parseInt(table[i][1]) == ans[0]) {
                System.out.println(table[i][0]);
            }
        }

        System.out.println("Longest words:");
        for (int i = 0; i < table.length; i++) {
            if (Integer.parseInt(table[i][1]) == ans[1]) {
                System.out.println(table[i][0]);
            }
        }
    }

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (RuntimeException e) {
            return count;
        }
    }

    static String[] splitManually(String text) {
        int len = findLength(text);
        int spaces = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        int[] index = new int[spaces + 2];
        index[0] = -1;

        int k = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                index[k++] = i;
            }
        }
        index[k] = len;
        String[] words = new String[spaces + 1];

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = index[i] + 1; j < index[i + 1]; j++) {
                temp += text.charAt(j);
            }
            words[i] = temp;
        }
        return words;
    }

    static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    static int[] findShortestAndLongest(String[][] table) {
        int min = Integer.parseInt(table[0][1]);
        int max = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }
}

import java.util.*;

public class CompareSplitText {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] manualWords = splitManually(text);
        String[] builtInWords = text.split(" ");

        boolean same = compareArrays(manualWords, builtInWords);

        System.out.println("Words count: " + manualWords.length);
        System.out.println(same ? "Both matched" : "Not matched");
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

        int[] indexes = new int[spaces + 2];
        indexes[0] = -1;

        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                indexes[idx++] = i;
            }
        }
        indexes[idx] = len;
        String[] words = new String[spaces + 1];

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) {
                temp += text.charAt(j);
            }
            words[i] = temp;
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
}

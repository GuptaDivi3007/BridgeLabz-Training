import java.util.*;

public class IsAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);
        System.out.println(result ? "Anagram" : "Not anagram");
    }

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}

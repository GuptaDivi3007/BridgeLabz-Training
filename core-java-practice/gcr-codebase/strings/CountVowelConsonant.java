import java.util.*;

public class CountVowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] ans = countVowelsAndConsonants(text);

        System.out.println("Vowels: " + ans[0]);
        System.out.println("Consonants: " + ans[1]);
    }

    static int checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return 1;
            }
            else {
                return 2;
            }
        }
        return 0;
    }

    static int[] countVowelsAndConsonants(String text) {
        int countVowel = 0;
        int countConsonants = 0;

        for (int i = 0; i < text.length(); i++) {
            int res = checkChar(text.charAt(i));

            if (res == 1) {
                countVowel++;
            }
            else if (res == 2) {
                countConsonants++;
            }
        }

        return new int[]{countVowel, countConsonants};
    }
}

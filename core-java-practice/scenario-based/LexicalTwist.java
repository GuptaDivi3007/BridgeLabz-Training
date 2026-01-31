import java.util.*;

public class LexicalTwist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord = sc.nextLine();
        if (isInvalidWord(firstWord)) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        String secondWord = sc.nextLine();
        if (isInvalidWord(secondWord)) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        if (isReverse(firstWord, secondWord)) {
            String reversed = new StringBuilder(firstWord).reverse().toString().toLowerCase();
            StringBuilder transformed = new StringBuilder();

            for (int i = 0; i < reversed.length(); i++) {
                char ch = reversed.charAt(i);
                if (isVowel(ch)) {
                    transformed.append('@');
                }
                else {
                    transformed.append(ch);
                }
            }

            System.out.println(transformed.toString());
        }
        else {
            String combined = (firstWord + secondWord).toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < combined.length(); i++) {
                char ch = combined.charAt(i);
                if (isVowel(ch)) {
                    vowelCount++;
                }
                else if (Character.isLetter(ch)) {
                    consonantCount++;
                }
            }

            if (vowelCount == consonantCount) {
                System.out.println("Vowels and consonants are equal");
            }
            else if (vowelCount > consonantCount) {
                printFirstTwoDistinct(combined, true);
            }
            else {
                printFirstTwoDistinct(combined, false);
            }
        }
    }

    public static boolean isInvalidWord(String text) {
        return text.contains(" ");
    }

    public static boolean isReverse(String first, String second) {
        String reversedFirst = new StringBuilder(first).reverse().toString();
        return reversedFirst.equalsIgnoreCase(second);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void printFirstTwoDistinct(String text, boolean vowelsNeeded) {
        Set<Character> seen = new LinkedHashSet<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (vowelsNeeded && isVowel(ch)) {
                seen.add(ch);
            }
            else if (!vowelsNeeded && Character.isLetter(ch) && !isVowel(ch)) {
                seen.add(ch);
            }

            if (seen.size() == 2) {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : seen) {
            ans.append(c);
        }

        System.out.println(ans.toString());
    }
}

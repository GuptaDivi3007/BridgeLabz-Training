import java.util.*;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paragraph = sc.nextLine();
        String targetWord = sc.nextLine();
        String replacementWord = sc.nextLine();

        analyzeText(paragraph, targetWord, replacementWord);
    }

    public static void analyzeText(String text, String target, String replacement) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("Word Count: 0");
            System.out.println("Longest Word: ");
            System.out.println("Updated Text: ");
            return;
        }

        String cleaned = text.trim().replaceAll("\\s+", " ");
        String[] words = cleaned.split(" ");

        int wordCount = words.length;
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        String updatedText = cleaned.replaceAll("(?i)\\b" + target + "\\b", replacement);

        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Updated Text: " + updatedText);
    }
}

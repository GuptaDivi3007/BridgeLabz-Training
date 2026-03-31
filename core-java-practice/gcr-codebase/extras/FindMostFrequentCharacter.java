import java.util.*;

public class FindMostFrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];
        char mostFrequent = str.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println(mostFrequent);
    }
}

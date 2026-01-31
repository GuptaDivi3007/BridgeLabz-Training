import java.util.*;

public class FindRepeatingWords {

    public static String findRepeatingWords(String sentence) {
        String[] words = sentence.split("\\s+");
        Map<String, Integer> count = new HashMap<>();
        
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> repeats = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                repeats.add(entry.getKey());
            }
        }
        return String.join(", ", repeats);
    }
    
    public static void main(String[] args) {
        String example = "This is is a repeated repeated word test.";
        System.out.println(findRepeatingWords(example)); 
    }
}

import java.util.*;

public class SentenceSearch {

    public static void main(String[] args) {

        String[] sentences = {
            "Java is powerful",
            "I love programming",
            "Linear search is simple",
            "Data structures are important"
        };

        String word = "search";
        String result = linearSearch(sentences, word);
        
        System.out.println(result);
    }

    static String linearSearch(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}
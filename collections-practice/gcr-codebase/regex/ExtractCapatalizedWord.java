import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapatalizedWord {

    private static final Pattern CAP_PATTERN = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b");
    
    public static List<String> extractCapitalized(String text) {
        List<String> words = new ArrayList<>();
        if (text == null) {
            return words;
        }
        
        Matcher matcher = CAP_PATTERN.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> caps = extractCapitalized(text);
        caps.forEach(System.out::println);
    }
}


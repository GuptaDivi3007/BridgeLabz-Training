import java.util.*;
import java.util.regex.*;

public class ExtractProgrammingLanguages {

    private static final Set<String> LANGUAGES = Set.of("Java", "Python", "JavaScript", "Go", "C", "C++", "Rust", "Swift", "Kotlin");

    public static String extractLanguages(String text) {
        List<String> found = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b(" + String.join("|", LANGUAGES) + ")\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            String lang = matcher.group(1);
            if (!found.contains(lang)) { 
                found.add(lang);
            }
        }
        return String.join(", ", found);
    }
    
    public static void main(String[] args) {
        String example = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println(extractLanguages(example)); 
    }
}

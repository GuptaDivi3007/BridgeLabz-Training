import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {

    private static final Pattern URL_PATTERN = Pattern.compile("https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[/\\w]*");
    
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        if (text == null) {
        	return links;
        }
        Matcher matcher = URL_PATTERN.matcher(text);
        while (matcher.find()) {
            links.add("[" + matcher.group() + "](" + matcher.group() + ")");
        }
        return links;
    }
    
    public static void main(String[] args) {
        String text = "Visit [https://www.google.com](https://www.google.com) and [http://example.org](http://example.org)";
        List<String> links = extractLinks(text);
        links.forEach(System.out::println);
    }
}

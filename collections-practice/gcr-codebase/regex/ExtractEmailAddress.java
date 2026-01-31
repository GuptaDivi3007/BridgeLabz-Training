import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        if (text == null) {
            return emails;
        }
        
        Matcher matcher = EMAIL_PATTERN.matcher(text);
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at [support@example.com](mailto:support@example.com) and info@company.org";
        List<String> emails = extractEmails(text);
        emails.forEach(System.out::println);
    }
}

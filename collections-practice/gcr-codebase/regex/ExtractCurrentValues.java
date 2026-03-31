import java.util.*;
import java.util.regex.*;

public class ExtractCurrentValues {

    public static String extractCurrencies(String text) {
        Pattern pattern = Pattern.compile("\\$?\\d+(?:\\.\\d{2})?");
        Matcher matcher = pattern.matcher(text);
        
        List<String> found = new ArrayList<>();
        while (matcher.find()) {
            if (!found.contains(matcher.group())) {
                found.add(matcher.group());
            }
        }
        
        return String.join(", ", found);
    }
    
    public static void main(String[] args) {
        String example = "The price is $45.99, and the discount is 10.50.";
        System.out.println(extractCurrencies(example)); 
    }
}

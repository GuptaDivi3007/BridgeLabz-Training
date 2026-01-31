import java.util.regex.Pattern;

public class ReplaceSpaces {

    private static final Pattern MULTI_SPACE = Pattern.compile("\\s+");
    
    public static String normalizeSpaces(String text) {
        if (text == null) {
        	return null;
        }
        return MULTI_SPACE.matcher(text).replaceAll(" ").trim();
    }
    
    public static void main(String[] args) {
        String input = "This  is   an    example  with   multiple    spaces. ";
        String output = normalizeSpaces(input);
        System.out.println(output);
    }
}

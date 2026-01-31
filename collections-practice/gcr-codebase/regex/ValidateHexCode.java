import java.util.regex.Pattern;

public class ValidateHexCode {

    private static final Pattern HEX_PATTERN = Pattern.compile("^#[A-Fa-f0-9]{6}$");
    
    public static boolean isValid(String hex) {
        if (hex == null) return false;
        return HEX_PATTERN.matcher(hex).matches();
    }
    
    public static void main(String[] args) {
        String[] tests = {"#FFA500", "#GG3500", "#123"};
        for (String test : tests) {
            System.out.println(test + ": " + isValid(test));
        }
    }
}


import java.util.regex.Pattern;

public class ValidLicensePlate {

    private static final Pattern LICENSE_PATTERN = Pattern.compile("^[A-Z]{2}\\d{4}$");
    
    public static boolean isValid(String plate) {
        if (plate == null) {
            return false;
        }
        return LICENSE_PATTERN.matcher(plate).matches();
    }

    public static void main(String[] args) {
        String[] tests = {"UK1234", "345", "EJ879", "9"};
        for (String test : tests) {
            System.out.println(test + ": " + isValid(test));
        }
    }
}

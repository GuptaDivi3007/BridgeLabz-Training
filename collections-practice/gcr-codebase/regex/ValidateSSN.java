import java.util.regex.*;

public class ValidateSSN {

    private static final Pattern SSN_PATTERN = Pattern.compile("\\b\\d{3}-\\d{2}-\\d{4}\\b");
    
    public static String validateSSN(String text) {
        Matcher matcher = SSN_PATTERN.matcher(text);
        if (matcher.find()) {
            String ssn = matcher.group();
            if (isValidFormat(ssn)) {
                return "\"" + ssn + "\" is valid";
            }
            return "\"" + ssn + "\" is invalid";
        }
        return " No valid SSN found";
    }
    
    private static boolean isValidFormat(String ssn) {
        String[] parts = ssn.split("-");
        String area = parts[0], group = parts[1], serial = parts[2];
        return !area.equals("000") && !area.equals("666") && 
               !group.equals("00") && !serial.equals("0000") &&
               Integer.parseInt(area) <= 899;
    }

    public static void main(String[] args) {
        System.out.println(validateSSN("My SSN is 123-45-6789."));  
        System.out.println(validateSSN("123456789"));             
    }
}

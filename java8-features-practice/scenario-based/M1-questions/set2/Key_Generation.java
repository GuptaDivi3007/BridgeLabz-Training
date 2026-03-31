import java.util.*;

public class Key_Generation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String str = sc.nextLine();

            String result = validate(str);

            if (!result.equals("VALID")) {
                System.out.println(result);
            }
            else {
                String key = generateKey(str);
                System.out.println("The generated key is - " + key);
            }
        }
    }

    public static String validate(String str) {

        if(str.isEmpty()){
            return "Invalid Input (empty string)";
        }

        if (str.length() < 6) {
            return "Invalid Input (length < 6)";
        }

        // String[] arr = str.split("\\s+");
        // if(arr.length > 1){
        //     return "Invalid Input (contains space)";
        // }

        if(str.matches(".*\\s+.*")){
            return "Invalid Input (contains space)";
        }

        if (str.matches(".*[0-9].*")) {
            return "Invalid Input (contains digits)";
        }

        if (str.matches(".*[^a-zA-Z0-9 ].*")) {
            return "Invalid Input (contains special character)";
        }

        return "VALID";
    }

    public static String generateKey(String str) {

        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ((int)c % 2 != 0) {
                sb.append(c);
            }
        }

        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }

        return sb.toString();
    }
}
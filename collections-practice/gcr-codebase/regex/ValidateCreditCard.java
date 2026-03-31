public class ValidateCreditCard {

    public static boolean isValid(String cardNumber) {
        cardNumber = cardNumber.replaceAll("[^0-9]", "");
        if (cardNumber.length() != 16 || !cardNumber.matches("^[45].*")) {
            return false;
        }
        int sum = 0;
        boolean doubleDigit = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = cardNumber.charAt(i) - '0';
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("4111111111111111"));  
        System.out.println(isValid("5555555555554444")); 
        System.out.println(isValid("411111111111111")); 
    }
}


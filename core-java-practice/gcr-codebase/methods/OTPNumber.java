import java.util.*;

public class OTPNumber {

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.print(otp + " ");
        }
        
        System.out.println();
        System.out.println("Are all OTPs unique? " + checkUnique(otpArray));
    }

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean checkUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

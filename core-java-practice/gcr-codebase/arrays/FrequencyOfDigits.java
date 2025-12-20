import java.util.*;

public class FrequencyOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digit = new int[count];
        temp = n;

        for (int i = 0; i < count; i++) {
            digit[i] = temp % 10;
            temp = temp / 10;
        }

        int[] freq = new int[10];

        for (int i = 0; i < digit.length; i++) {
            freq[digit[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
    }
}

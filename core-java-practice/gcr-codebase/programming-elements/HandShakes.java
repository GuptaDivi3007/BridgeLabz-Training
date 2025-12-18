import java.util.*;

public class Handshakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + ans);
    }
}

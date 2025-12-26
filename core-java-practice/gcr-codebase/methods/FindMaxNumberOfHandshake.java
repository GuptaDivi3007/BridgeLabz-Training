import java.util.*;

public class FindMaxNumberOfHandshake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = calculateHandshakes(n);
        System.out.println("The number of possible handshakes is " + ans);
    }

    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }
}

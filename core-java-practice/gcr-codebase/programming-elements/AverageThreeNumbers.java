import java.util.*;

public class AverageThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int average=(n1 + n2 + n3) / 3;
        System.out.print(average);
	}
}

import java.time.*;
import java.util.*;

public class DateComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate firstDate = LocalDate.parse(sc.next());
        LocalDate secondDate = LocalDate.parse(sc.next());

        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is before second date");
        }
        else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is after second date");
        }
        else {
            System.out.println("Both dates are the same");
        }
    }
}

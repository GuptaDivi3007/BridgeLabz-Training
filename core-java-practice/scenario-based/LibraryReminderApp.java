import java.time.*;
import java.util.*;

public class LibraryReminderApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            LocalDate dueDate = LocalDate.parse(sc.next());
            LocalDate returnDate = LocalDate.parse(sc.next());

            int fine = calculateFine(dueDate, returnDate);
            System.out.println(fine);
        }
    }

    public static int calculateFine(LocalDate dueDate, LocalDate returnDate) {
        if (returnDate.isAfter(dueDate)) {
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
            return (int) lateDays * 5;
        }
        return 0;
    }
}

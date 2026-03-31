import java.time.*;
import java.time.format.*;

public class DateFormatting {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter firstFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter secondFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter thirdFormat = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(today.format(firstFormat));
        System.out.println(today.format(secondFormat));
        System.out.println(today.format(thirdFormat));
    }
}

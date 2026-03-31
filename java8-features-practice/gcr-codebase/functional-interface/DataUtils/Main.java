package DataUtils;
import java.time.LocalDate;
public class Main {
	public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        // Different date formats
        String format1 = DateUtils.formatDate(today, "dd-MM-yyyy");
        String format2 = DateUtils.formatDate(today, "dd MMM yyyy");
        String format3 = DateUtils.formatDate(today, "yyyy/MM/dd");

        System.out.println("Invoice Date (dd-MM-yyyy): " + format1);
        System.out.println("Invoice Date (dd MMM yyyy): " + format2);
        System.out.println("Invoice Date (yyyy/MM/dd): " + format3);
    }
}

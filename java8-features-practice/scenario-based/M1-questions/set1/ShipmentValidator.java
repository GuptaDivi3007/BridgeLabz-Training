import java.util.*;

public class ShipmentValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String record = sc.nextLine();

            if (validateRecord(record)) {
                System.out.println("COMPLIANT RECORD\n");
            } else {
                System.out.println("NON-COMPLIANT RECORD");
            }
        }
    }

    public static boolean validateRecord(String record) {

        String[] parts = record.split("\\|");
        if (parts.length != 5) return false;

        return validateCode(parts[0]) &&
               validateDate(parts[1]) &&
               validateMode(parts[2]) &&
               validateWeight(parts[3]) &&
               validateStatus(parts[4]);
    }

    public static boolean validateCode(String code) {

        if (!code.matches("SHIP-[1-9][0-9]{5}")) return false;

        return !code.matches(".*(\\d)\\1{3,}.*");
    }

    public static boolean validateDate(String date) {

        if (!date.matches("20\\d{2}-(0[1-9]|1[0-2])-([0-2][0-9]|3[0-1])"))
            return false;

        String[] d = date.split("-");
        int y = Integer.parseInt(d[0]);
        int m = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (isLeap(y)) days[1] = 29;

        return day <= days[m - 1];
    }

    public static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    public static boolean validateMode(String mode) {
        return mode.matches("AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT");
    }

    public static boolean validateWeight(String w) {

        if (!w.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?")) return false;

        double val = Double.parseDouble(w);

        return val >= 0 && val <= 999999.99;
    }

    public static boolean validateStatus(String status) {
        return status.matches("DELIVERED|CANCELLED|IN_TRANSIT");
    }
}
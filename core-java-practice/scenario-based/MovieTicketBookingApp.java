import java.util.*;

public class MovieTicketBookingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String movieType = sc.next();
            if (movieType.equalsIgnoreCase("exit")) {
                break;
            }

            String seatType = sc.next();
            boolean wantsSnacks = sc.nextBoolean();

            int ticketPrice = calculateTicketPrice(movieType, seatType);
            int snackPrice = wantsSnacks ? 100 : 0;

            int totalAmount = ticketPrice + snackPrice;
            System.out.println(totalAmount);
        }
    }

    public static int calculateTicketPrice(String movieType, String seatType) {
        int basePrice;

        switch (movieType.toLowerCase()) {
            case "regular":
                basePrice = 150;
                break;
            case "3d":
                basePrice = 200;
                break;
            case "imax":
                basePrice = 300;
                break;
            default:
                return 0;
        }

        if (seatType.equalsIgnoreCase("gold")) {
            basePrice += 100;
        }
        else if (seatType.equalsIgnoreCase("silver")) {
            basePrice += 50;
        }

        return basePrice;
    }
}

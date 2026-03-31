import java.util.*;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String details = sc.nextLine();

        Utility utility = new Utility();
        String transportId = details.split(":")[0];

        if (!utility.validateTransportId(transportId)) {
            return;
        }

        GoodsTransport transport = utility.parseDetails(details);
        String type = utility.findObjectType(transport);

        System.out.println("Transporter id : " + transport.getTransportId());
        System.out.println("Date of transport : " + transport.getTransportDate());
        System.out.println("Rating of the transport : " + transport.getTransportRating());

        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) transport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        }
        else {
            TimberTransport tt = (TimberTransport) transport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + transport.vehicleSelection());
        System.out.println("Total charge : " + transport.calculateTotalCharge());
    }
}

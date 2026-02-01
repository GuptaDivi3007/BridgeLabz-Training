public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    public String vehicleSelection() {
        double area = 2 * 3.147 * timberRadius * timberLength;

        if (area < 250) {
            return "Truck";
        }
        else if (area <= 400) {
            return "Lorry";
        }
        return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        double volume = 3.147 * timberRadius * timberRadius * timberLength;
        double rate = timberType.equalsIgnoreCase("Premium") ? 0.25 : 0.15;
        double price = volume * timberPrice * rate;
        double tax = price * 0.3;
        double discount = 0;

        if (transportRating == 5) {
            discount = price * 0.2;
        }
        else if (transportRating == 3 || transportRating == 4) {
            discount = price * 0.1;
        }

        return (float) (price + tax + getVehicleCost(vehicleSelection()) - discount);
    }

    private int getVehicleCost(String vehicle) {
        if (vehicle.equalsIgnoreCase("Truck")) return 1000;
        if (vehicle.equalsIgnoreCase("Lorry")) return 1700;
        return 3000;
    }
}

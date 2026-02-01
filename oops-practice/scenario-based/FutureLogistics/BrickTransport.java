public class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";
        }
        else if (brickQuantity <= 500) {
            return "Lorry";
        }
        return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;
        float discount = 0;

        if (transportRating == 5) {
            discount = price * 0.2f;
        }
        else if (transportRating == 3 || transportRating == 4) {
            discount = price * 0.1f;
        }

        return price + tax + getVehicleCost(vehicleSelection()) - discount;
    }

    private int getVehicleCost(String vehicle) {
        if (vehicle.equalsIgnoreCase("Truck")) return 1000;
        if (vehicle.equalsIgnoreCase("Lorry")) return 1700;
        return 3000;
    }
}

import java.util.*;

public class Flight {

    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
        if (!flightNumber.matches("FL-[0-9]{4}")) {
            throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
        }
        int num = Integer.parseInt(flightNumber.substring(3));
        if (num < 1000 || num > 9999) {
            throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
        }

        return true;
    }
    public boolean validateFlightName(String flightName) throws InvalidFlightException {
        if (!(flightName.equalsIgnoreCase("SpiceJet")
                || flightName.equalsIgnoreCase("Vistara")
                || flightName.equalsIgnoreCase("IndiGo")
                || flightName.equalsIgnoreCase("Air Arabia"))) {

            throw new InvalidFlightException("The flight name " + flightName + " is invalid");
        }
        return true;
    }
    public boolean validatePassengerCount(int passengerCount, String flightName)
            throws InvalidFlightException {

        Map<String, Integer> capacity = new HashMap<>();
        capacity.put("SpiceJet", 396);
        capacity.put("Vistara", 615);
        capacity.put("IndiGo", 230);
        capacity.put("Air Arabia", 130);

        int max = capacity.get(flightName);
        if (passengerCount <= 0 || passengerCount > max) {
            throw new InvalidFlightException(
                    "The passenger count " + passengerCount + " is invalid for " + flightName);
        }

        return true;
    }
    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
        Map<String, Double> fuel = new HashMap<>();
        fuel.put("SpiceJet", 200000.0);
        fuel.put("Vistara", 300000.0);
        fuel.put("IndiGo", 250000.0);
        fuel.put("Air Arabia", 150000.0);

        double maxFuel = fuel.get(flightName);
        if (currentFuelLevel < 0 || currentFuelLevel > maxFuel) {
            throw new InvalidFlightException("Invalid fuel level in flight" + flightName);
        }
        return maxFuel - currentFuelLevel;
    }
}

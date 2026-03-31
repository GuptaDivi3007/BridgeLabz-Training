public class PeakSeasonPricing implements PricingStrategy{
    
	public double calculate(double basePrice) {
        return basePrice * 1.5;
    }
}

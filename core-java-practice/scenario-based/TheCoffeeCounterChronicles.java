import java.util.*;

public class TheCoffeeCounterChronicles {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffeeType = 3;
        int gst = 5;
        int money;

        switch(coffeeType) {
        case 1:
        	money = 120;
        	System.out.println(totalAmount(money, gst));
        	break;
        case 2:
            money = 150;
    	    System.out.println(totalAmount(money, gst));
    	    break;
        case 3:
        	money = 200;
    	    System.out.println(totalAmount(money, gst));
    	    break;
        case 4:
        	money = 250;
    	    System.out.println(totalAmount(money, gst));
    	    break;   
        }
	}

	public static String totalAmount(int money, int gst) {
		double gstAdded = money * gst / 100.0;
		
		double total = money + gstAdded;
		return "The total money of your coffee is " + total;
	}
}

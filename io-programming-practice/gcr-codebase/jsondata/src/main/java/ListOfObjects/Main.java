package ListOfObjects;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Main {
	 public static void main(String[] args) {

	        
	        List<Car> cars = new ArrayList<>();
	        cars.add(new Car("Toyota", "Fortuner", 2023));
	        cars.add(new Car("Honda", "City", 2022));
	        cars.add(new Car("Hyundai", "Creta", 2021));

	        
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String jsonArray = gson.toJson(cars);

	        
	        System.out.println(jsonArray);
	  }
}

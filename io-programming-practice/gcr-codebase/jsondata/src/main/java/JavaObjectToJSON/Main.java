package JavaObjectToJSON;
import com.google.gson.Gson;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car car=new Car("Toyota", "Fortuner", 2023);
        Gson gson = new Gson();
        String json = gson.toJson(car);
        System.out.println(json);
	}

}

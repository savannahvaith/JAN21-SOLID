package solid.depinv;

public class Runner {

	
	public static void main(String[] args) {
		WeatherTracker wt = new WeatherTracker();
		Phone p = new Phone(); 
		wt.setConditions("Rainy");
		wt.notify(p);
	}
}

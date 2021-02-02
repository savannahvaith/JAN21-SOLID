package solid.depinv;

public class Phone implements Notifier {

	@Override
	public void alertWeatherConditions(String conditions) {
		if(conditions.equals("Rainy")) {
			System.out.println("It is rainy");
		}
		
	}

//	public String generateWeatherAlert(String weather) {
//		String alert = "It is "+ weather; 
//		return alert; 
//	}

}

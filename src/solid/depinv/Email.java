package solid.depinv;

public class Email implements Notifier{

	@Override
	public void alertWeatherConditions(String conditions) {
		if(conditions.equals("Sunny")) {
			System.out.println("It is sunny");
		}
		
	}

//	public String generateWeatherAlert(String weather) {
//		String alert = "It is " + weather; 
//		return alert; 
//	}

}

package solid.depinv;

public class WeatherTracker {
	
	private String conditions; 
//	Phone phone; 
//	Email email; 
	
	public WeatherTracker() {
//		phone = new Phone(); 
//		email = new Email(); 
	}
	
	public String getConditions() {
		return conditions; 
	}
	
//	public void setConditions(String weather) {
//		this.conditions = weather; 
//		if(weather.equals("Rainy")) {
//			String alert = phone.generateWeatherAlert(weather);
//			System.out.println(alert);
//		}
//		if(weather.equals("Sunny")) {
//			String alert = email.generateWeatherAlert(weather);
//			System.out.println(alert);
//		}		
//	}
	
	public void setConditions(String weather) {
		this.conditions = weather; 
	}
	
	// revised version 
	public void notify(Notifier n) {
		n.alertWeatherConditions(conditions);
	}

}

package solid.srp;

public class Runner {
	
	public static void main(String[] args) {
		
		Car merc = new Car("Grey", 17000, "c220d");
		Driver lewisHamilton = new Driver(); 
		
		lewisHamilton.setMilesDriven(500);
		lewisHamilton.drive(merc);
		
		System.out.println(merc.getMileage());
		
	}

}

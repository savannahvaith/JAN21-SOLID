package solid.liskov;

public class LifeTime extends Member{

	public LifeTime(String name) {
		super(name);
		this.memberType = "Life Time";
	}

	@Override
	public void addToDB() {
		System.out.println("Added LifeTime user to DB");
	}

	@Override
	public void makeBooking() {
		System.out.println("Lifetime user made a booking");
		
	}
	
}

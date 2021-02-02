package solid.liskov;

public class Annual extends Member {

	public Annual(String name) {
		super(name);
		this.memberType = "Annual";
	}

	@Override
	public void addToDB() {
		System.out.println("Added Annual member to DB");
	}

	@Override
	public void makeBooking() {
		System.out.println("Annual User made Booking");
		
	}
	
}

package solid.liskov;

public class Member implements IBooking, Idb {
	
	public String name; 
	public String memberType; 
	
	//constructor
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public void addToDB() {}

	@Override
	public void makeBooking() {}

}

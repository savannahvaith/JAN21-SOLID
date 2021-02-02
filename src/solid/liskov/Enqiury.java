package solid.liskov;

public class Enqiury implements Idb {
	private String name; 
	private String memberType; 
	
	public Enqiury(String name) {
		this.name = name;
		this.memberType = "Enquiry";
	}

	@Override
	public void addToDB() {
		System.out.println("Equiry added to DB");
	}


}

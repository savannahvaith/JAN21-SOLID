package solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) throws Exception {
		List<Idb> davidLloyds = new ArrayList<>(); 
		davidLloyds.add(new LifeTime("Bob Marley"));
		davidLloyds.add(new Annual("Aswene Sivaraj"));
		davidLloyds.add(new Enqiury("Sav"));
		
		for(Idb m : davidLloyds) {
			m.addToDB();
		}
		
	}

}

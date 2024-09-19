package Collection;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap ob = new HashMap();
		ob.put(6, "blue");
		ob.put(7,"pink");
		ob.put(null, "red");
		ob.put(8, null);
		
		System.out.println(ob.entrySet());
		System.out.println(ob.get(6));
	}

}

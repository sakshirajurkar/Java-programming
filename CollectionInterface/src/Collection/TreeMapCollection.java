package Collection;

import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {
		TreeMap ob = new TreeMap();
		ob.put(6, "Trisha");
		ob.put(3,"Kavya");
		ob.put(8, "Trisha");
		ob.put(8, null);
		System.out.println(ob);
		
		System.out.println(ob.containsValue(null));
	}

}

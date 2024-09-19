package Collection;

import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		Vector ob = new Vector();
		ob.add(87);
		ob.add(84.8);
		ob.add("Raysa");
		ob.add("Maroom");
		ob.add(null);
		ob.add(true);
		ob.add('A');
		
		System.out.println(ob.contains('A'));
		System.out.println(ob.add("Kashis"));
		System.out.println(ob);
		System.out.println(ob.getFirst());
		System.out.println(ob.size());
		System.out.println(ob.getLast());
	}

}

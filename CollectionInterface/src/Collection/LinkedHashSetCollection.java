package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection {

	public static void main(String[] args) {
		LinkedHashSet ob = new LinkedHashSet();
		ob.add(98.57);
		ob.add("Kivya");
		ob.add(87);
		ob.add('A');
		ob.add(true);
		ob.add(null);
		System.out.println(ob);
		System.out.println(ob.contains('A'));
		System.out.println(ob.getFirst());
	}

}

package Collection;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		HashSet ob = new HashSet();
		ob.add("Krati");
		ob.add(98);
		ob.add(96.67);
		ob.add('A');
		ob.add(null);
		ob.add(true);
		
		System.out.println(ob);
		
		System.out.println(ob.contains('A'));
		System.out.println(ob.isEmpty());
		System.out.println(ob.size());
		System.out.println(ob.hashCode());
		System.out.println(ob.getClass());
	}

}

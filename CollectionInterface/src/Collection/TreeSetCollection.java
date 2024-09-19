package Collection;

import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		TreeSet ob = new TreeSet();
		ob.add("Pink");
		ob.add("Yellow");
		ob.add("green");
		ob.add("maroom");
		System.out.println(ob);
		
		System.out.println(ob.size());
		System.out.println(ob.first());
		System.out.println(ob.pollFirst());//this method remove first object
		System.out.println(ob.add("Blue"));
		System.out.println(ob);
	}

}

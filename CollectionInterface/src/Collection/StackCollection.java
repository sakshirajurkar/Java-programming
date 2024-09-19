package Collection;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		Stack ob = new Stack();
		ob.add("Evic");
		ob.add('K');
		ob.add(98);
		ob.add(null);
		
		System.out.println(ob.add("Naythra"));
		System.out.println(ob.size());
		System.out.println(ob.search('K'));
	}

}

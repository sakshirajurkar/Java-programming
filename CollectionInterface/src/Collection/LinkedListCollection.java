package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList ob = new LinkedList();
		ob.offer("Rasha");
		ob.offer("Twinkle");
		ob.offer(98.78);
		ob.offer(null);
		ob.offer(true);
		ob.offer('A');
		
		System.out.println(ob.contains('A'));
		System.out.println(ob.getFirst());
		System.out.println(ob.getLast());
		System.out.println(ob.add("Kia"));
		System.out.println(ob);
	}
}

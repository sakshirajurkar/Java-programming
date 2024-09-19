package collection_day4;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue1 {

	public static void main(String[] args) {
	   LinkedList ob = new LinkedList();
	   ob.offer('A');
	   ob.offer("Achal");
	   ob.offer(76.98);
	   ob.offer(67);
	   ob.offer(true);
	   ob.offer(null);
	   System.out.println(ob);
	   
	   System.out.println(ob.contains(67));
	   System.out.println(ob.getFirst());
	   System.out.println(ob.getLast());
	   System.out.println(ob.isEmpty());
	   System.out.println(ob.size());
	   
	}

}

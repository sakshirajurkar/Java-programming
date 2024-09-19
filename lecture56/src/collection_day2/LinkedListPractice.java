package collection_day2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList ob = new LinkedList();
		ob.add(null);
		ob.add('A');
		ob.add("Shreya");
		
		LinkedList ob1 = new LinkedList();
		ob1.add(false);
		ob1.add(87);
		ob1.add("Kairav");
		ob1.add(54.34);
		
		ob.addAll(ob1);
		System.out.println(ob);
		
//		Iterator <String> itr = ob.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}

}

package collection_day3;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ob = new LinkedList();
		ob.add("Aradhya");
		ob.add("Shree");
		ob.add("Ravi");
		ob.add("kavya");
		ob.add("Rashi");
		System.out.println(ob);
		
		LinkedList ob1 = new LinkedList();
		ob1.add("Mumbai");
		ob1.add("Nagpur");
		ob1.add("Delhi");
		ob1.add("Kerla");
		ob1.add("Kolkata");
		
		Iterator  itr = ob.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ob.addAll(ob1);
		System.out.println(ob);
		
		System.out.println(ob.contains("Delhi"));
		System.out.println(ob.containsAll(ob1));
		System.out.println(ob.lastIndexOf("Mumbai"));
		System.out.println(ob.isEmpty());
		System.out.println(ob.getFirst());
		
		
	}

}

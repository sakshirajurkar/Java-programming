package collection_day3;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetCollection {

	public static void main(String[] args) {
		TreeSet ob = new TreeSet();
		ob.add(76);
		ob.add(87);
        ob.add(87);
		System.out.println(ob);
		
		TreeSet ob1 = new TreeSet ();
		ob1.add(87);
		ob1.add(67);
		ob.add(45);
		ob.add(34);
		
		Iterator itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ob.addAll(ob1);
		System.out.println(ob);
	}
}

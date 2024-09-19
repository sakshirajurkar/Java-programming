package collection_day2;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetCollection {

	public static void main(String[] args) {
		TreeSet ob = new TreeSet();
		ob.add(98);
		ob.add(77);
		ob.add(45);
		ob.add(74);
		
		System.out.println(ob.first());
		
		Iterator itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(ob.contains(76));
		
		System.out.println(ob.getFirst());
		
		
	}

}

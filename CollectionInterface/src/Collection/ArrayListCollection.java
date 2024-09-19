package Collection;
// ArrayList 
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList ob = new ArrayList();
		ob.add("tia");
		ob.add(89);
		ob.add(78.89);
		ob.add(null);
		ob.add(true);
		ob.add('B');
		System.out.println(ob);
		
		ArrayList ob1 = new ArrayList();
		ob1.add("Rani");
		ob1.add(98);
		ob1.add('B');
		ob1.add(87.56);
		ob1.add("Yellow");
		System.out.println(ob1);
		
		ob.addAll(ob1);
		System.out.println(ob);
		
		Iterator itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(ob.size());
		System.out.println(ob.indexOf("Rani"));
		System.out.println(ob.contains('B'));
		System.out.println(ob.getLast());
		System.out.println(ob.isEmpty());
		
	}

}

package collection_day3;
import java.util.Stack;
import java.util.Iterator;
public class StackMethod {

	public static void main(String[] args) {
		Stack ob = new Stack ();
		ob.add("Rudra");
		ob.add(87.65);
		ob.add('A');
		ob.add(null);
		ob.add("Ankita");
		
		Stack ob1 = new Stack ();
		ob1.add(98.59);
		ob1.add('S');
		ob1.add(null);
		ob1.add("Anushka");
		
		Iterator itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ob.addAll(ob1);
		System.out.println(ob);
		
		System.out.println(ob.isEmpty());
		
		ob.add(5, 'K');
		System.out.println(ob);
		
		System.out.println(ob.lastElement());
		
		System.out.println(ob.contains(ob1));
		System.out.println(ob.p);
		
		
		
		
	}

}

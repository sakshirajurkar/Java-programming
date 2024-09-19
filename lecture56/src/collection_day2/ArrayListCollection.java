package collection_day2;
import java.util.ArrayList;
public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList ob = new ArrayList ();
		ob.add("Rashi");
		ob.add("Avi");
		ob.add(98);
		ob.add(87.67f);
		ob.add('A');
		ob.add(null);
		System.out.println(ob);
		
		ArrayList ob1 = new ArrayList ();
		ob1.add("Ravi");
		ob1.add("Akriti");
		ob1.add("aman");
		ob1.add("Aviral");
		
		for (int i=0; i<ob.size(); i++)
		{
			System.out.println(ob.get(i));
		}
		ob.addAll(ob1);
		System.out.println(ob);
		
		ob.addFirst("Esha");
		System.out.println(ob);
		
		System.out.println(ob.equals(ob1));
		
		System.out.println(ob.contains("Ravi"));
		
		System.out.println(ob.getFirst());
		
		System.out.println(ob.getLast());
		
		ob.add(8, 'S');
		System.out.println(ob);
		
	}
}

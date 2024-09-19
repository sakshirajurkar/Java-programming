package collection_day3;
import java.util.Vector;
import java.util.Iterator;
public class VectorMethods {

	public static void main(String[] args) {
		Vector ob = new Vector();
		ob.add(97);
		ob.add("Trisha");
		ob.add("Aboli");
		ob.add(98.54f);
		ob.add('A');
		ob.add(null);
		ob.add(97);
		System.out.println(ob);
		
		Vector ob1 = new Vector ();
		ob1.add(76);
		ob1.add('S');
		ob1.add(87.56f);
		ob1.add(null);
		ob1.add(45);
		System.out.println(ob1);
		
		Iterator itr = ob.iterator();
        while (itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        ob.addAll(ob1);
        System.out.println(ob);
        
        ob.add("Shreshta");
        System.out.println(ob);
        
        ob.add(8, 'H');
        System.out.println(ob);
		
	}
}

package package1;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionIterative {

	public static void main(String[] args) {
		ArrayList <String> ob = new ArrayList <String> ();
		ob.add("USA");
		ob.add("canad");
		ob.add("india");
		ob.add("pakistan");
		
		ArrayList <String> ob2 = new ArrayList <String> ();
		ob2.add("pune");
		ob2.add("mumbai");
		ob2.add("nagpur");
		ob2.add("delhi");
		
		Iterator <String> itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("if there empty element: "+ob.isEmpty());
		
		ob.addAll(ob2);
		System.out.println(ob);
		
		System.out.println("print first elemetnt: "+ob.getFirst());
		
//		ob.clear();
//		System.out.println(ob);
		
		ob.contains(ob2);
		System.out.println(ob);
		
		//remove elements from array
//		System.out.println("remove the elemet"+ob.remove(7));
		
		//size of array
		System.out.println("size of elements: "+ob.size());
		
		//add element
		ob.add(6,"aurangabad");
		System.out.println("add element kolkata: " + ob);
		
		//clone 
		
		
	}

}

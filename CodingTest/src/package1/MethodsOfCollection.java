package package1;
import java.util.ArrayList;
import java.util.Iterator;
public class MethodsOfCollection {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String> ();
		list.add("lilly");
		list.add("rose");
		list.add("tulip");
		list.add("lotus");
		
		ArrayList <String> ob = new ArrayList <String> ();
		ob.add("nagpur");
		ob.add("mumbai");
		ob.add("delhi");
		ob.add("kolkata");
		
		Iterator <String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	   list.addAll(ob);
	   System.out.println(list);
	   
	   list.add(4,"banaras");
	   System.out.println(list);
		
	   list.contains(ob);
	   System.out.println(list);
	   
	   System.out.println(list.getFirst());
	   
	   System.out.println(list.getLast());
	   
	   System.out.println(list.isEmpty());
	   
	   System.out.println(list.size());
	}

}

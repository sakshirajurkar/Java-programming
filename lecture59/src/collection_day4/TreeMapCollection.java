package collection_day4;
import java.util.TreeMap;
public class TreeMapCollection {

	public static void main(String[] args) {
		TreeMap ob = new TreeMap();
		ob.put(1, "Riya");
		ob.put(2, "Ravish");
		ob.put(3,"Kalyani");
		ob.put(4,"Ravya");
		ob.put(5, "Anayra");
		System.out.println(ob);
		
		TreeMap ob1 = new TreeMap ();
		ob1.put(6, "Rashi");
		ob1.put(7,"Amisha");
		ob1.put(8, "karan");
		ob1.put(9, "Aviral");
		ob1.put(10, "Karishma");
		System.out.println(ob1);
		
		ob1.putAll(ob1);
		System.out.println("Updated object: " +ob1);
	}

}

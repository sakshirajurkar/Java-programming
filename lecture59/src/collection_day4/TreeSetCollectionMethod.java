package collection_day4;
import java.util.TreeMap;
public class TreeSetCollectionMethod {

	public static void main(String[] args) {
		TreeMap ob = new TreeMap();
		ob.put(1, "Kriti");
		ob.put(2, "Riya");
		ob.put(3, "Ariv");
		ob.put(4, "Kavya");
		
		TreeMap ob1 = new TreeMap();
		ob1.put(5, "Ravi");
		ob1.put(6, "Radha");
		ob1.put(7, "Anuj");
		ob1.put(4, "Krati");
		
		ob1.putAll(ob);
//		System.out.println(ob1);
		
		System.out.println(ob.entrySet());
//		
		System.out.println(ob.isEmpty());
		System.out.println(ob.firstKey());
		System.out.println(ob.lastKey());
		System.out.println(ob.firstEntry());
//		System.out.println(ob.lastEntry());
//		System.out.println(ob.size());
//		System.out.println(ob.remove(1));
//		
	}
}

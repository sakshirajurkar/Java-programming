package collection_day4;
import java.util.HashMap;
public class HashMapCollection {

	public static void main(String[] args) {
		HashMap ob = new HashMap();
		ob.put(1, "Amayra");
		ob.put(3, "Krish");
		ob.put(2, "Aishwarya");
		ob.put(4, "AVi");
		ob.put(5, "Lokesh");
		System.out.println(ob);
		
		System.out.println(ob.get(1));
		System.out.println(ob.isEmpty());
		System.out.println(ob.size());
		System.out.println(ob.keySet());
		System.out.println(ob.entrySet());
		System.out.println(ob.containsKey(4));
		System.out.println(ob.containsValue("AVi"));
		System.out.println(ob.values());
		
	}

}

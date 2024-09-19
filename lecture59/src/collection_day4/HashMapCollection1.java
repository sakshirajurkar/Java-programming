package collection_day4;
import java.util.HashMap;
public class HashMapCollection1 {

	public static void main(String[] args) {
		HashMap ob = new HashMap();
		ob.put(null, "kriti");
		ob.put(1, "Kavya");
		ob.put(7, "kriyansh");
		ob.put(6, "Ravi");
		ob.put(3, "Avneet");
		System.out.println(ob);
		
	   System.out.println(ob.replace(1, "Rani"));
	   System.out.println(ob);
	}

}

package collection_day4;
import java.util.TreeMap;
public class TreeMapCollection1 {

	public static void main(String[] args) {
		TreeMap ob = new TreeMap();
		ob.put(5, "Kiara");
		ob.put(2, "Alia");
		ob.put(8, "Katrina");
		ob.put(6, null);
		ob.put(3, "Alia");
		System.out.println(ob);
		
		TreeMap ob1 =  new TreeMap();
		ob1.put(5, "Pink");
		ob1.put(4, "black");
		ob1.put(8, null);
		ob1.put(6, "white");
		ob1.put(3, "Red");
		
		ob1.putAll(ob);
		System.out.println("updated values: "+ob1);
		
		System.out.println(ob.containsKey(5));
		
		System.out.println(ob.isEmpty());
		
		System.out.println(ob.firstKey());
		
	    System.out.println(ob.replace(2, "krati"));
	    
	    System.out.println(ob);
	    
	    System.out.println(ob.firstKey());
	}

}

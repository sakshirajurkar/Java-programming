package collection_day3;
import java.util.TreeSet;
public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ob = new TreeSet ();
		ob.add(65);
		ob.add(98);
		ob.add(22);
		ob.add(34);
		ob.add(87);
		
		TreeSet ob1 = new TreeSet ();
		ob1.add(1);
		ob1.add(9);
		ob1.add(6);
		ob.add(4);
		ob.add(8);
		
		
		ob.addAll(ob1);
		System.out.println(ob);
	    System.out.println(ob.first());
	    System.out.println(ob.last());
	    System.out.println(ob.size());
	    System.out.println(ob.contains(65));
	    System.out.println(ob.isEmpty());
	}

}

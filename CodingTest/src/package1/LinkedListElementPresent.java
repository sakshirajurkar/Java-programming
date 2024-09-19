package package1;
import java.util.LinkedList;
public class LinkedListElementPresent {
 //check if elements present in linked list
	public static void main(String[] args) {
		LinkedList ob = new LinkedList();
		ob.add("Krushna");
		ob.add("Ravya");
		ob.add("Radha");
		ob.add(87);
		ob.add(null);
		ob.add(87.99);
		
		System.out.println(ob.contains("Ravya"));
	}

}

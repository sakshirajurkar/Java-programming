package collection_day2;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListCollection {

    public static void main(String[] args) {
    	LinkedList ob = new LinkedList();
    	ob.add("Jiva");
    	ob.add("Shanaya");
    	ob.add('A');
    	
    	LinkedList ob1 = new LinkedList();
    	ob1.add("Kavya");
    	ob1.add('K');
    	ob1.add("Kalyani");
    	
    	Iterator itr = ob.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    	
    	ob.addAll(ob1);
    	System.out.println(ob);
    	
    	System.out.println(ob.indexOf("Shanaya"));
    	
    	System.out.println(ob.contains("G"));
    	
    	System.out.println(ob.size());
  }

}

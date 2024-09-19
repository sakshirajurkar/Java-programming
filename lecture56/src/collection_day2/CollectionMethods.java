package collection_day2;
import java.util.Iterator;
import java.util.ArrayList;
public class CollectionMethods {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String> ();
		list.add("black");
		list.add("white");
		list.add("blue");
		list.add("pink");
		
		ArrayList <String> al = new ArrayList <String> ();
		al.add("lotus");
		al.add("tulip");
		al.add("rose");
		
		list.addAll(al);
		System.out.println(list);
		
		//delete all element
		//list.clear();
		//System.out.println(list);
		
		System.out.println("The array contain all elemetnts?: "+list.containsAll(al));
		
		String[] str = new String [list.size()];
	    list.toArray(str);
	    
	    for(int i=0; i<str.length; i++)
	    {
	    	System.out.println(str[i] + " ");
	    }
	}
}

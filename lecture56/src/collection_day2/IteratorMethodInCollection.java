package collection_day2;
import java.util.Iterator;
import java.util.ArrayList;
public class IteratorMethodInCollection {

	public static void main(String[] args) {
		ArrayList <String> ob = new ArrayList<String>();
		ob.add("Nagpur");
		ob.add("Mumbai");
		ob.add("Kolkata");
		ob.add("Delhi");
		
		Iterator<String> itr = ob.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

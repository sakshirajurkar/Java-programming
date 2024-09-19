package collection_day1;
import java.util.ArrayList;
public class ArrayListPractice {

public static void main(String[] args) {
	ArrayList ob = new ArrayList();
	ob.add("Carry");
	ob.add(true);
	ob.add(87.45);
	ob.add(87);
	System.out.println(ob);
	
	ob.addFirst("Rani");
	System.out.println(ob);
	
	System.out.println(ob.contains("Rani"));
	
	System.out.println(ob.isEmpty());
	
	System.out.println(ob.getLast());
}

}

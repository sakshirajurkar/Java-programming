package collection_day4;
import java.util.PriorityQueue;

public class PriorityQueueCollection {
	public static void main(String[] args) {
		PriorityQueue ob = new PriorityQueue();
		ob.add("Lotus");
		ob.add("Lilly");
		ob.add("Sunflower");
		ob.add("Marigold");
		ob.add("Lilly");
		
		PriorityQueue ob1 = new PriorityQueue();
		ob1.add("Yellow");
		ob1.add("Pink");
		ob1.add("Red");
		ob1.add("Black");
		ob1.add("White");
		
		ob.addAll(ob1);
		System.out.println(ob);
		
		System.out.println(ob.isEmpty());
		
		System.out.println(ob.contains("White"));
		System.out.println(ob.containsAll(ob1));
		System.out.println(ob.remove("Red"));
		System.out.println(ob);
		System.out.println(ob.add("Maroom"));
		System.out.println(ob);
		System.out.println(ob.equals(ob1));
		System.out.println(ob.size());
	}
	

}

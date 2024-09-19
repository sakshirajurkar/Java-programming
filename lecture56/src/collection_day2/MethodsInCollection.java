package collection_day2;
import java.util.Iterator;
import java.util.ArrayList;
public class MethodsInCollection {

	public static void main(String[] args) {
		ArrayList  <String> list = new ArrayList <String>();
		list.add("Red");
		list.add("green");
		list.add("yellow");
		list.add("pink");
		list.add("purple");
		list.add("black");
		list.add("white");
		list.add("maroom");
		list.add("gray");
		list.add("voilet");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		 //get element by index
		System.out.println("Element at index 1 :"+ list.get(2));
		
		//if list contain an element
		System.out.println("Does the list contain black element: "+list.contains("black"));
		
		//index of element
		System.out.println("index of gray: "+ list.indexOf("gray"));
		
		//add an element at specific index
		list.add(4,"brown");
		System.out.println(list);
		
		//if the arraylist is empty
		System.out.println("if the array list is empty: "+list.isEmpty());
		
		//size of array list
		System.out.println("size of array list: "+list.size());
	}

}

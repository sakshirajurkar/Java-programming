package collection_day4;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue li=new LinkedList();
		li.add("Shriya");
		li.add(null);
		li.add(98);
		li.add(56.76);
		li.offer(true);
		li.add('A');
		System.out.println(li);
		
		System.out.println(li.poll());
		System.out.println(li);
		
	}
}

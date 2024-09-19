package package1;

import java.util.ArrayList;

public class EvenOddByCollection {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		ArrayList <Integer> list1 = new ArrayList<>();
	    
		for (int i=0; i<=10; i++)
		{
			if (i%2==0)
			{
				list.add(i);
			}
			else
			{
				list1.add(i);
			}
				
	   }
		
		System.out.println(list);
		System.out.println(list1);
	   }
	

}

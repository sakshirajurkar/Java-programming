package package1;

import java.util.Arrays;

public class SameArrays {
	//Comparison of two arrays

	public static void main(String[] args) {
		
		int a1[]= {10,20,30,40};
		int a2[]= {10,20,30,40};
		
		if(Arrays.equals (a1,a2))
			
		{
			System.out.println("Same Arrays");
		}
		else
		{
		   System.out.println("Not Same Arrays");
			
		}
		
	}

}

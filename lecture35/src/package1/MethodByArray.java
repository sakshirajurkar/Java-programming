package package1;
import java.util.Scanner;
//How to pass array ion a method
public class MethodByArray {
	static void createyArray()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the element of array");
		int a[] = new int [size];
		for(int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		  
		   displayArray(a);
		 
	}
    static void displayArray(int a[])
    {
    	System.out.println("Display element");
    	for (int i=0; i<a.length; i++)
    	{
    		System.out.println(a[i]);
    	}
    }
	 
	
	public static void main(String[] args) {
		  
		
    	createyArray();
	}

}

package package1;
import java.util.Scanner;
public class ElementAndSizeArray {
   //accepting array from user and display it
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("Entert the element of array");
		for(int i=0; i<a.length; i++)
		a[i] = sc.nextInt();
		
		
	     
	     System.out.println("Display Element");
	     for(int i=0; i<a.length; i++)
	    	 System.out.println(a[i]);
		
		
		
		
	}

}

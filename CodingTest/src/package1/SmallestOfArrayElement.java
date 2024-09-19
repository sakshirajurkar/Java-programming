package package1;
import java.util.Scanner;
public class SmallestOfArrayElement {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter the size of array");
	  int size = sc.nextInt();
	  
	  System.out.println("Enter the element of array");
	  int a[] = new int[size];
	  for(int i=0; i<a.length; i++) {
		  a[i] = sc.nextInt();
	  }
	
	 int min = a[0];
	 for (int i=0; i<a.length; i++) {
		 if(min>a[i])
		 {
			 System.out.println("Smallest num "+a[i]);
		 }
	 }
	 
}
}

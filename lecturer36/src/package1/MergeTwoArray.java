package package1;
import java.util.Scanner;
public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array1");
	    int size1= sc.nextInt();
	    System.out.println("Enter the size of array2");
	    int size2= sc.nextInt();
	    
	    int a[]= new int[size1];
	    int b[]=new int [size2];
	    int c[]=new int [size1+size2];
	    
	    System.out.println("Enter the element of array a:");
	    for (int i=0; i<a.length; i++) {
	    	a[i]= sc.nextInt();
	    }
	    System.out.println("Enter the element of array b:");
	    for (int i=0; i<b.length; i++) {
	    	b[i]=sc.nextInt();
	   }
	 System.out.println("Merging is in process...");
	 
	 int index=0;
	 
	 for (int i=0; i<a.length; i++) {
		 c[index++]= a[i];
	 }
	 System.out.println(index+" index...");
	 for (int i=0; i<b.length; i++) {
	    	c[index++] = b[i];
	    }
	 for (int i=0; i<c.length; i++) {
		 System.out.println(c[i]+" ");
	 }
	    
	}
}

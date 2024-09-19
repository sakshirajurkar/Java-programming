package package1;
import java.util.Scanner;
public class Arrays1 {

	
	int a[] = new int [5];
	
	 void  createArray()
	  {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the size of array");
		 int size = sc.nextInt();
		 System.out.println("Enter the element of array");
		 for(int i=0; i<a.length; i++)
			 a[i] = sc.nextInt();
			 
	  }
	 void  displayArray()
	 {
		 System.out.println("Display element");
		 for(int i=0; i<a.length; i++)
			 System.out.println(a[i]);
	 }
	
	
   public static void main(String[] args) {
	   Arrays1 ob = new  Arrays1();
	   ob.createArray();
	   ob.displayArray();
	   
}

}

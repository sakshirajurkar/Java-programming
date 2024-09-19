package package1;
import java.util.Scanner;
public class EvenOdd {
	
	void createArray ()
	{
		int a[] = new int[5]; 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the element of array");
		for(int i=0; i<a.length; i++)
		a[i] = sc.nextInt();
		
		even(a);
    }
	    void even (int a[])
	   {
		for(int i=0; i<a.length; i++) {
		
		
		if(a[i] % 2==0)
		{
			System.out.println("Even num");
		}
		else 
		{
			System.out.println("odd num");
		}
		
		}		
	 }

	public static void main(String[] args) {
		EvenOdd ob = new EvenOdd ();
		ob.createArray ();
		
	}
}

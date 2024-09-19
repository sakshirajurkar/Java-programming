package package1;
import java.util.Scanner;
public class EvenOdd1 {
	//Create array
	void createArray()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		System.out.println("Enter the element of array");
		for (int i=0; i<a.length; i++) {
		    a[i] = sc.nextInt();
		}
		 even(a);
		 display(a);
		}
   //display array
		int [] display(int [] a)
		{
			System.out.println("Display the array");
			for (int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
			return a;
		}
		
   //even num
		int[] even(int [] a)
		{
			System.out.println("Print the even num");
			for (int i=0; i<a.length; i++)
			{
				if(a[i]%2==0) {
					System.out.println(a[i]);
				}
			}
			return a;
		}
	
	public static void main(String[] args) {
		EvenOdd1 sc = new EvenOdd1();
		sc.createArray();
		
	}
}
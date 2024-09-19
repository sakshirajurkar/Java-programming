package package1;
import java.util.Scanner;
public class EvenOddOfArray {
	void createArray()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		System.out.println("enter the element of array");
		int a[] = new int [size];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		even(a);
		display(a);
	}
	int[] even(int [] a)
	{
		System.out.println("Even num");
		for(int i=0; i<a.length; i++)
		{
		if(a[i] % 2 == 0)
		{
			System.out.println(a[i]);
		}
		
		}
		return a;
		
	}
	int[] display(int[] a)
	{
		System.out.println("displaying the element of array");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		return a;
	}

	public static void main(String[] args) {
		EvenOddOfArray ob = new EvenOddOfArray();
		ob.createArray();
		
	}
}

package package1;
import java.util.Scanner;
public class EvenOddArray {

	void creatArray()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the element of array");
		int a[] = new int [size];
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}
		even (a);
		display (a);
	}
   int display (int [] a)
		{
			for (int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
			return a;
			
	   } 
   
		int[] even (int [] a)
		{
		System.out.println("print even num");
			for(int i=0; i<a.length; i++) {
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			return a;
			
		}
		}

	public static void main(String[] args) {
		EvenOddArray ob = new EvenOddArray();
	}

}

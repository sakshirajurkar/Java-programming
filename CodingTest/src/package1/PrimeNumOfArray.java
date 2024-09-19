package package1;
import java.util.Scanner;
public class PrimeNumOfArray {
	void createArray()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the element of array");
		int a[] = new int[size];
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		primeNum(a);
	}
	void primeNum(int [] a)
	{
		System.out.println("prime num");
		for (int i=0; i<a.length; i++) {
			int count =0;
			for(int x=2; i<a[i]; i++) {
				count++;

			if(count>0)
			{
				System.out.println(x);
			}
			}
		}
		
		
	}

	public static void main(String[] args) {
		PrimeNumOfArray ob = new PrimeNumOfArray();
		ob.createArray();
		
	}

}

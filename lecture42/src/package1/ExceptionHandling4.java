package package1;
import java.util.Scanner;
public class ExceptionHandling4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		System.out.println("Enter the element of array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element which you want to display");
		int search = sc.nextInt();
		
		try
		{
		System.out.println("Display the element "+a[search]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter the element less than the length of array");
		}
		System.out.println("Existing...");
		}
	}



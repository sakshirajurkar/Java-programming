package package1;
import java.util.Scanner;
public class ArrayByMethod {
	static void CreateArray()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the element of array:");
		int a[] = new int [size];
		
		for(int i = 0; i<a.length; i++)
		a[i] = sc.nextInt();
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		CreateArray();
	}

}
 
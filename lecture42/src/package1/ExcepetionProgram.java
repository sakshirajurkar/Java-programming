package package1;
import java.util.Scanner;
public class ExcepetionProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size ofd array");
		int size = sc.nextInt();
		int a[] = new int [size];
		System.out.println("Enter the element of array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("index of element");
		int search = sc.nextInt();
		
		try
		{
			System.out.println("displya the element: "+a[search]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Give index less than length");
		}
		
		
	}

}

package package1;
import java.util.Scanner;
public class SmallestElementArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		System.out.println("Enter the element of array");
		for (int i =0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Smallest  num ");
		for (int i=0; i<a.length; i++) {
			int num = a[0];
			if (a[i] <= num)
			{
				System.out.println(a[i]);
			}
		}
	}

}

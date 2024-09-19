package package1;
import java.util.Scanner;
public class GreatestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		System.out.println("Enter the element of array");
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int i=0;
		int num =a[0];
		for( i=0; i<a.length; i++) {
			
			if (a[i]>num)
			{
				num = a[i];
			}
		}
		System.out.println("greater num of array"+a[i]);
		
	}

}

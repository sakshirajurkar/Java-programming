package package1;
import java.util.Scanner;
public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array a");
		int size1 = sc.nextInt();
		System.out.println("Enter the size of array b");
		int size2 = sc.nextInt();
		
		int a[] = new int [size1];
		int b[] = new int [size2];
		int c[] = new int [size1+size2];
		
		System.out.println("ENter the element of array a:");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("ENter the element of array a:");
		for(int i=0; i<b.length; i++)
		{
			b[i] = sc.nextInt();
		}
		System.out.println("ENter the element of array a:");
		for(int i=0; i<c.length; i++)
		{
			c[i] = a[i];
			c[i] = b[i];
			System.out.println(c[i]);
		},m
	}
}

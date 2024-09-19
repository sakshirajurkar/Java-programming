package package1;
import java.util.Scanner;
public class AdditionInOneArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		System.out.println("Enter element of array");
		int a[] = new int [size];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum= a[i]+sum;
			System.out.println("Sum of element "+sum);
		}
		
	}
}

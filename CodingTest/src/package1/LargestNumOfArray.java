package package1;
import java.util.Scanner;
public class LargestNumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		int c[] = new int[size];
		
		System.out.println("Enter the element of array:");
		for (int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element of array:");
		for (int i=0; i<b.length; i++) {
			b[i]=sc.nextInt();
		}
		
		
		
	
		
	}

}

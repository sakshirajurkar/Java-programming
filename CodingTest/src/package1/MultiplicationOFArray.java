package package1;
import java.util.Scanner;
public class MultiplicationOFArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		int b[] = new int [size];
		int c[] = new int [size];
		
		
		System.out.println("Enter element of array a:");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element of array b:" );
		for(int i=0; i<b.length; i++){
			b[i]=sc.nextInt();
		}
		System.out.println("Enter the element of array c:" );
		for(int i=0; i<c.length; i++){
			c[i]=a[i]*b[i];
		}
		System.out.println("Multiplication of two array" );
		for(int i=0; i<a.length; i++) {
			System.out.println(c[i]);
		}
		 
	}

}

package package1;
import java.util.Scanner;
public class AdditionOfTwoArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter th size of array");
		int size= sc.nextInt();
		 
		int a[] = new int [size];
		int b[] = new int [size];
		int c[] = new int [size];
		 
		System.out.println("Enter the element of  array a:");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		
	}

}

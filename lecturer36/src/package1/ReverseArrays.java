package package1;
import java.util.Scanner;
public class ReverseArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("Enter the element of array");
		for (int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1; i>=0; i--) {
			
			System.out.println(a[i]+ " ");
		}
	}

}

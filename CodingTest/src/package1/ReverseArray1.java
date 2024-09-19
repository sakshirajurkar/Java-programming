package package1;
import java.util.Scanner;
public class ReverseArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the element of array");
		int a[] = new int[size];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Reverse of array");
		for (int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}

}

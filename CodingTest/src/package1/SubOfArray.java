package package1;
import java.util.Scanner;
public class SubOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter element of array");
		int a[] = new int[size];
		for (int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Sub of array");
		int sub = 0;
		for (int i=0; i<a.length; i++) {
			sub = a[i]-sub;
			System.out.println(sub);
			
			
		}
		
	}

}

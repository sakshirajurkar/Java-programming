package package1;
import java.util.Scanner;
public class SumOfArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the element of array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Sum of array");
		int num = 0; 
		for (int i=0; i<a.length; i++) {
			num = num + a[i];
			
		}
		System.out.println(num);
				
	}

}

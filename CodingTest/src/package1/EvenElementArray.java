package package1;
import java.util.Scanner;
public class EvenElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the element of an array");
		int a[] = new int [size];
		for (int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
			
			
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0)
			{
				System.out.println("Even num "+a[i]);
			}
			
		}
	}

}

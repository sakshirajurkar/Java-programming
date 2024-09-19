package package1;
import java.util.Scanner;
public class PringDigitdsOffArray {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size of array");
	int size = sc.nextInt();
	
	System.out.println("Enter the element of array");
	int a[] = new int[size];
	for(int i=0; i<a.length; i++) {
		a[i] = sc.nextInt();
	}
	
	System.out.println("Sum of array");
	   int sum =0;
	for (int i=0; i<a.length; i++) {
		sum = sum+a[i];
	    System.out.println(sum);
	}
	
}
}

package package1;
import java.util.Scanner;
public class ReverseOfArray {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	
	System.out.println("Enter the element of array");
	int a[] = new int [size];
	for (int i=0; i<a.length; i++) {
		a[i] = sc.nextInt();
	}
	
	//reverse 
	System.out.println("Enter the reverse of array");
	for(int i=a.length-1; i>=0; i--) {
		System.out.println(a[i]);
	}
	
}
	
}

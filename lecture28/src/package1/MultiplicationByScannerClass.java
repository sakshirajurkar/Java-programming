package package1;
import java.util.Scanner;

public class MultiplicationByScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int a = sc.nextInt();
		
		System.out.println("Enter the value");
		int b = sc.nextInt();
		
		System.out.println("Enter the value");
		int c = sc.nextInt();
		
        int f = a*b*c;
		System.out.println("Multiplication of four num: "+f);
		 
		
		
	}

}

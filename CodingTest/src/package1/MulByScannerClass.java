package package1;
import java.util.Scanner;

public class MulByScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter num of your choice");
		int a = sc.nextInt();
		System.out.println("Enter num of your choice");
		int b = sc.nextInt();
		
		int result = a*b;
		System.out.println("a*b= "+result);
		
		int result1 = a+b;
		System.out.println("a+b= "+result1);
		
		int result2 = a-b;
		System.out.println("a-b= "+result2);
		
		int result3 = a/b;
		System.out.println("a/b= "+result3);
		
		
	}
}

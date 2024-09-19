package package1;
import java.util.Scanner;
public class SumOfDigitsOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the digit of a");
		int a = sc.nextInt();
		
		System.out.println("Enter the digit of b");
		int b = sc.nextInt();
		
		int c= a+b;
		System.out.println("Sum of digits: "+c);
	}

}

package package1;
import java.util.Scanner;
public class GreaterNumByScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num");
		int num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" Num is greater");
		}
	   else
	   {
		   System.out.println(num1+" Num is less");
	   }
				
	}

}

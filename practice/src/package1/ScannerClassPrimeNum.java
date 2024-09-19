package package1;
import java.util.Scanner;
public class ScannerClassPrimeNum {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("enter the number");
		  int num = sc.nextInt();
		  
		
		 int count = 0;
		 
		 for(int i = 2; i<=num; i++ )
		 {
			 count++;
		 }
		 if(count>0)
		 {
			 System.out.println("Not prime num");
		 }
		 else 
		 {
			 System.out.println(" prime num");
		 }
	}
	  
	 
	
	
}

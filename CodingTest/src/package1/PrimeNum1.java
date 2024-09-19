package package1;
import java.util.Scanner;
public class PrimeNum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num");
		int a = sc.nextInt();
		
		int count = 0;
		
		for (int i = 2; i<=a; i++)
		{
			if (i%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Num is not prime");
		}
		else 
			{
			System.out.println("Num is  prime");
		     }
	}

}

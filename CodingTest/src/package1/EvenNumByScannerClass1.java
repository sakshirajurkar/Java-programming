package package1;
import java.util.Scanner;
public class EvenNumByScannerClass1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start range");
		int start = sc.nextInt();
		System.out.println("Enter the start range");
		int end = sc.nextInt();
		System.out.println("Even num are");
		for (int i=start; i<=end; i++)
			
			if(i%2==0)
		{
			System.out.println("Number is even"+i);
		}
	 
		
	}

}

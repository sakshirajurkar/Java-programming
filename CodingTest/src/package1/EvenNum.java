package package1;
import java.util.Scanner;
public class EvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the start value");
		int start = sc.nextInt();
		System.out.println("Enter the end value");
		int end = sc.nextInt();
		
		for (int i = start; i<=end; i++  )
		if(i%2==0)
		{
			System.out.println(i+"  is even num");
		}
		else
		{
			System.out.println(i+"  is odd num");
		}
		
	}

}

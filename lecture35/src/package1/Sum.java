package package1;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int a[] = new int [5];
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the element");
		for(int i=0; i<a.length; i++)
		{
			a[i] =sc. nextInt();
		}
		
		int sum=0;
		for (int i=0; i<a.length; i++)
		{
		sum = sum+a[i];
		System.out.println("Sum of array");
		System.out.println(sum);
		
		int average = sum/a[i];
		System.out.println("Average of array");
		System.out.println(average);
		}
		
		
		
		
		
	}
}

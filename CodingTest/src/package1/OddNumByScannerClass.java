package package1;

import java.util.Scanner;

public class OddNumByScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 
		System.out.println("Enter the num");

		int a = sc.nextInt();
		
		if (a %1 != 0)
		{
			System.out.println("Num is odd");
		}
		else
		{
			System.out.println("Num is even");

		}
	}

}

package Package1;

import java.util.Scanner;

public class fibonacciSeriesUsrInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the input");
		int input = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1+" "+ num2);
		for(int i=1; i<input; i++) {
			int num3 = num1+num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
		
	} 

}

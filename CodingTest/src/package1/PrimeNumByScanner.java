package package1;

import java.util.Scanner;

public class PrimeNumByScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int a = sc.nextInt();
		int count =0;
		for(int i=2; i<=a; i++) {
			if(i % i ==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("not prime num");
		}
		else {
			System.out.println("prime num");
		}
	}
}

package Package3;

import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		int num = 2;
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i != 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("prime num");
		} else {
			System.out.println("not prime");
		}
	}
}
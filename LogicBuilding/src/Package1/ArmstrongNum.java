package Package1;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num = 153;
		int rem = 0;
		int cube = 0;
		int temp = num;
		while (num != 0) {
			rem = num % 10;
			cube = cube + (rem * rem * rem);
			num = num /10;
		}
		if (temp == cube) {
			System.out.println("armstrong num");
		} else {
			System.out.println("not armstrong num");
		}
	}
}

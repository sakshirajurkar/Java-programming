package Package1;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int num = 24;
		int num1 = 0;
		int num2 = 1;

		System.out.println(num1 + " " + num2);
		for (int i = 0; i < num; i++) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;

		}
	}
}

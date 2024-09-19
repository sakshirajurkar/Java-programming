package Package1;

public class FibonacciSeries7 {

	public static void main(String[] args) {
		int value = 10;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1 + " " + num2);
		for(int i=0; i<value; i++) {
			int num3 = num1+num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			
		}
	}
}
/*
 * 
 * 0 1 1 2 3 5 8 
 */

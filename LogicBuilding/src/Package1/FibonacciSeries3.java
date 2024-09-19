package Package1;

public class FibonacciSeries3 {

	public static void main(String[] args) {
		//0 1 1
		int  num = 10;
		int num1 = 1;
		int num2 = 0;
		
		System.out.println(num1 + " " + num2);
		for(int i=1; i<num; i++) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 =  num2;
			num2 = num3;
		}
	}

}

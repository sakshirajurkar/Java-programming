package Package1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int input = 5;
		int num1 = 0;
		int num2 = 1;
		
		System.out.print(num1 + " " + num2+" ");
		for(int i=0 ; i<input; i++) {
		int	num3 = num1 + num2;
		System.out.print(num3+" ");//2 3
		num1=num2;
		num2=num3;
		}
	}

}
/*
 0 1 1 2 3 5 8............
 num1=0 num2=1        num1=1 num2=1
 num1+num2=num3 1
 var a <= vaer b
 * */

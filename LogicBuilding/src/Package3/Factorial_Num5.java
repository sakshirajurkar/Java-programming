package Package3;

public class Factorial_Num5 {

	public static void main(String[] args) {
		int fact = 1;
		int num = 65;
		
		for(int i=1; i<num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
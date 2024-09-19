package Package1;

public class FactorialNum5 {

	public static void main(String[] args) {
		int num = 44;
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}

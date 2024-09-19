package Package1;

public class FactorialNum3 {

	public static void main(String[] args) {
		int num = 12;
		int fact = 1;
		
		for(int i =1; i<num; i++ ) {
			fact = fact * i;
			System.out.println(fact);
		}
	}

}

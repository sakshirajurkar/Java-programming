package Package2;

public class Factorial7 {

	public static void main(String[] args) {
		int num =23;
		int fact =1;
		
		for(int i=1; i<num; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
		
	}
}
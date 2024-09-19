package package1;

public class FactorialNum {

	public static void main(String[] args) {
		//1*2*3*4*5*6*7*8*9*10
		int num = 10;
		int fact = 1;
		
		for(int i=1; i<num; i++ ) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}

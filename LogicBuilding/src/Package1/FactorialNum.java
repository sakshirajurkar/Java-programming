package Package1;

public class FactorialNum {
	public static void main(String[] args) {
		 int num = 5;
		 int fact=1;
		 
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("factorial:"+fact);
		
	}
}

/*
 * 5=1*2*3*4*5=120 fact=1 1*1=1 1*2=2 2*3=6
 * fact=1
 * i=1
 * fact=fact*i 1*1=1
 * fact=1 i=2 2
 * fact=2 i=3
 * 2*3=6 i=4
 * 24 i=5
 * 120
 * 
 * 
 */

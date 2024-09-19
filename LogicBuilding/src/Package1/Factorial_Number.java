package Package1;

public class Factorial_Number {

	public static void main(String[] args) {
		int a[] = {32,43,45,23,87};
		
		for(int i=0; i<a.length; i++) {
			int fact =1;
			for(int j=1; j<a.length; j++) {
				fact = fact * a[i];
			}
			System.out.println(fact);
		}
	}

}

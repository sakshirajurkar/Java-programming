package Package3;

public class Sum_Digits_Num {

	public static void main(String[] args) {
		int num = 123;
		int sum =0;
		int rev= 0;
		
		while(num>0) {
			rev = num%10;
			sum = sum +rev;
			num = num/10;
		}
		System.out.println(sum);
	}
}

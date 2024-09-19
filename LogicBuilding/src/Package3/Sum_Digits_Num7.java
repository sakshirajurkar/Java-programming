package Package3;

public class Sum_Digits_Num7 {

	public static void main(String[] args) {
		int digit = 53767;
		int sum = 0;
		int rev =0;
		while (digit != 0) {
			rev = digit%10;
			sum = sum + rev;
			digit = digit/10;
		}
		System.out.println(sum);
	}
}

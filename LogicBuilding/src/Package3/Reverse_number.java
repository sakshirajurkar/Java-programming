package Package3;

public class Reverse_number {

	public static void main(String[] args) {
		int num = 756;
		int rev =0;
		int sum = 0;
		
		while(num>0) {
			rev = num%10;
			sum = (sum * 10)+rev;
			num = num / 10;
		}
		System.out.println(sum);
	}

}

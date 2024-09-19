package Package1;

public class ReverseInt {

	public static void main(String[] args) {
		int num = 123;
		int rem = 0;
		int rev = 0;
		
		while(num !=0) {
			rem = num%10;
			rev = rem;
			num = num/10+rev;
		}
		System.out.println(rev);
	}
}

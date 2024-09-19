package Package1;

public class ReverseNum2 {

	public static void main(String[] args) {
		int num = 345;
		int rev = 0;
		int rem = 0;
		
		while (num != 0) {
			rem = num %10;
			num = num / 10;
		}
		System.out.println(num);
	}

}

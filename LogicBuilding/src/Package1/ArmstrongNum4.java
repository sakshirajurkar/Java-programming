package Package1;

public class ArmstrongNum4 {

	public static void main(String[] args) {
		int num = 153;
		int rem = 0;
		int cube = 0;
		int temp = num;
		while(num!=0) {
			rem = num % 10;
			cube = cube + (rem*rem*rem);
			num = num /10;
		}
		if(temp== cube) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}

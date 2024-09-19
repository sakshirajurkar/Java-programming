package Package1;

public class ArmstrongNum2 {

	public static void main(String[] args) {
		int value = 153;
		int rem = 0;
		int cube = 0;
		int temp = value;
		while (value !=0) {
			rem = value % 10;
			cube = cube + (rem *rem*rem);
			value = value/10;
		}
		if(cube == temp) {
			System.out.println("armstrong num");
		}
		else {
			System.out.println("not armstrong num");
		}
	}

}

package Package1;

public class ArmstrongNum3 {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int rem = 0;
		int cube = 0;
		for(int i=0; i<num; i++) {
			while(num != 0) {
				rem = num % 10;
				cube = cube + (rem*rem*rem);
				num = num / 10;
			}
			if(num == temp) {
				System.out.println("armstrong num");
			}
			else {
				System.out.println("not armstrong num");
			}
		}
	}
}

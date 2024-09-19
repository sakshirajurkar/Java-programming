package Package1;

public class ArmstrongNum1 {

    public static void main(String[] args) {
		int num = 153;
		int cube =0;
		int temp = num;
		int rem =0;
		while (num != 0) {
			rem = num % 10; 
			cube = num + (rem*rem*rem);
			num = num/10;
		}
		if(num==temp) {
			System.out.println("armstrong num");
		}
		else {
			System.out.println("not armstrong num");
		}
	}

}

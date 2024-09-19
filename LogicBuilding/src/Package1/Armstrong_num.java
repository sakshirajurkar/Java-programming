package Package1;

public class Armstrong_num {

	public static void main(String[] args) {
		int num = 153;
		int rev = 0;
		int cube =0;
		int temp = num;
		while(num>0) {
			rev = num % 10;
			cube =cube + (rev*rev*rev);
			num = num/10;
		}
		if(temp==cube) {
			System.out.println("armstrong num");
		}
		else {
			System.out.println("not armstrong num");
		}
	}

}

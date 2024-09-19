package Package3;

public class Num_Digits_given_NUm {

	public static void main(String[] args) {
		int num = 1324375;
		int count =0;
		
			while(num!=0) {
				num = num/10;
				count++;
			}
		System.out.println(count);
	}
}

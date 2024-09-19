package Package3;

public class Number_Digits_GivenNum {

	public static void main(String[] args) {
		int num = 38437759;
		int count = 0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
	}
}

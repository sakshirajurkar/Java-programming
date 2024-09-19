package Package3;

public class Number_Digits {

	public static void main(String[] args) {
		int num = 757866554;
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);

	}

}

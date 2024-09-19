package Package3;

public class Pallindrom_num4 {

	public static void main(String[] args) {
		int num = 101;
		int temp = num;
		int rev = 0;
		int sum =0;
		
		while (num>0) {
			rev = num%10;
			sum = (sum*10)+rev;
			num = num/10;
		}
		if(temp==sum) {
			System.out.println("pallindrom");
		}
		else {
			System.out.println("not pallindrom");
		}
	}
}

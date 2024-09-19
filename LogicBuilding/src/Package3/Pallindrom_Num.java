package Package3;

public class Pallindrom_Num {

	public static void main(String[] args) {
		int num = 108;
		int rev = 0;
		int sum =0;
		int temp=num;
		
		while(num>0) {
			rev = num % 10;
			sum = (sum*10)+rev;
			num = num / 10;
		}
		if(temp==sum) {
			System.out.println("pallindrom num");
		}
		else {
			System.out.println("not pallindrom num");
		}
	}

}

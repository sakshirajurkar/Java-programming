package Package2;

public class Pallindrome_Num {

	public static void main(String[] args) {
		int num = 121;
		int rem =0;
		int sum =0;
		int temp = num;
		
		while(num>0) {
			rem = num % 10;
			sum = (sum*10)+rem;
			num = num / 10;
		}
		if(sum==temp) {
			System.out.println(sum + " pallindrom num");
		}
		else {
			System.out.println(sum + " not pallindrome num");
		}
	}

}

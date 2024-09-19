package Package1;

public class PallindromNum {

	public static void main(String[] args) {
		int num = 342;
		int rem =0;
		int sum = 0;
		 int temp = num;
		 
		 while(num >0) {
			 rem = num % 10;
			 sum = (sum *10)+rem;
			 num = num/10;
		 }
		 if(sum == temp) {
			 System.out.println("pallindrom num");
		 }
		 else {
			 System.out.println("not pallindrom num");
		 }
	}
}

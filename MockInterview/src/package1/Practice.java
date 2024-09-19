package package1;

public class Practice {

	public static void main(String[] args) {
		int num = 123;
		int rev =0;
	    int temp=0;
		while(num>0) {
			rev=num%10;
			temp = (temp*10)+rev;
			num = num/10;
		}
		System.out.println(temp);
	}

}

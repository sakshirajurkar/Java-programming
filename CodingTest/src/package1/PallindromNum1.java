package package1;

public class PallindromNum1 {

	public static void main(String[] args) {
		int sum =0;
		int num = 123;
		int rem = 0;
		int temp = num;
		
		while (num > 0)
		{
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("pallindrom");
		}
		else {
			System.out.println("Not pallindrom");
		}
	}

}

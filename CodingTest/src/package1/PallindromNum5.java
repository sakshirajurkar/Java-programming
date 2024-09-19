package package1;

public class PallindromNum5 {

	public static void main(String[] args) {
		int num = 101;
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while (num > 0)
		{
			rem = num % 10;
			sum = (sum*10)+rem;
			num = num / 10;
			
		}
		System.out.println(sum);
		if ( sum == temp)
		{
			System.out.println("num is pallindrom");
		}
		else 
		{
			System.out.println("num is not pallindrom");
		}
		
				
	}

}

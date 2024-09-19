package package1;

public class PallindromNum3 {

	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		int rem = 0;
		int temp = num;
		
		while (num > 0)
		{
			rem = num % 10;
			sum = (sum* 10)+rem;
			num = num / 10;
			
		}
		System.out.println(sum);
		
		if (sum == temp)
		{
			System.out.println("Pallindrom");
		}
		else 
		{
			System.out.println("Not pallindrom");
		}
				
	}

}

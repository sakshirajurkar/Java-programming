package package1;

public class PrimeNum7 {

	public static void main(String[] args) {
		int count = 0;
		int num = 4;
		
		for (int i=2; i<=num; i++)
		{
			if (num % i == 0)
			{
				count ++;
			}
		}
		if (count > 0)
		{
			System.out.println("num is not prime");
		}
		else
		{
			System.out.println("num is prime");
		}
	}
}

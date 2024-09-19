package package1;

public class PallindromPrimeNum {

	public static void main(String[] args) {
		int num = 174;
		int rem =0; 
		int sum =0;
		int temp = num;
		
		while (num>0) {
		rem = num % 10;
		sum = (sum*10)+rem;
		num = num /10;
		}
		
		System.out.println(sum);
		
		if (sum==temp) {
			System.out.println("num is pallindrom");
		}
		else 
		{
			System.out.println("num is not pallindrom");
		}
		//prime
		int count = 0;
		
		for (int i=2; i<temp; i++) {
			count ++;
			if (temp%i==0)
		}
		
		
			if (count>0)
			{
				System.out.println("not prime");
			}
			else 
			{
				System.out.println("prime");
			}
		
		
		
		
	}

}

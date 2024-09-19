package package1;

public class PallindromNum2 {

	public static void main(String[] args) {
		int num = 121;
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while (num>0)
		{
			rem = num %10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		System.out.println(sum);
		
		if(temp == sum)
		{
			System.out.println("Pallindrom");
		}
		else
		{
			System.out.println("Not pallindrom");
		}
		
		int count = 0;
		for (int i=2; i<temp; i++)
			
		{
			count ++;
			if(temp%i==0)
				
		}
		
		if (count >0)
		{
			System.out.println("Num is not prime");
		}
		else 
		{
			System.out.println("Num is prime");
		}
			
	}

}

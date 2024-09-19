package package1;

public class PrimePallindromNum {

	public static void main(String[] args) {
		int num = 192;
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while (num>0)
		{
			rem = num %10;
			sum = (sum*10)+rem;
			num = num /10;
			
		}
		System.out.println(sum);
		
		if (sum==temp)
		{
			System.out.println("Pallindrom num");
		}
		else 
		{
			System.out.println("not Pallindrom num");
		}
		//prime 
		int count =0;
		
		for (int i=0; i<temp; i++) {
			count++;
		}
		if(temp%2==0)
			
		
		if(count>0)
		{
			System.out.println("not prime num");
		}
		else
		{
			System.out.println(" prime num");
		}
	}

}

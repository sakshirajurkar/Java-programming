package package1;

public class PrimeNumByForLoop {

	public static void main(String[] args) {
		int num = 12;
		int count = 0;
		
		for(int i = 2; i<num; i++)
		{
			count++;
		}
		if(count>0)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}

}

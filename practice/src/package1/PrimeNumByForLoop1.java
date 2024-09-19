package package1;

public class PrimeNumByForLoop1 {

	public static void main(String[] args) {
		int num = 9;
		int count = 0;
		
		for(int i = 2; i<num; i++);
		{
			count++;
		}
		if(count>0)
		{
			System.out.println("Num is not prime");
		}
		else
		{
			System.out.println("Num is prime");
		}
	}

}

package package1;

public class PrimeNum {

	public static void main(String[] args) {
		 
		int num =  11;
		int count = 0;
		
		for(int i = 2; i<num; i++)
		{
			count++;
		}
		if(count>0)
		{
			System.out.println("num is not prime");
		}
		else 
		{
			System.out.println("num is  prime");
		}
	}

}
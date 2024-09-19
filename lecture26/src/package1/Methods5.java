package package1;

public class Methods5 {
	void sum()
	{
		int sum = 0;
		int num = 5;
		int rem = 0;
		int temp = num;
		
		while (num>0)
		{
			rem = num%10;
			sum = num+rem;
			num = sum/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		 
		Methods5 t2 = new Methods5 ();
		t2.sum();
		
	}
}

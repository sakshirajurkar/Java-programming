package package1;

public class EvenOddByMethods {

	void evenOdd(int num)
	{
		if(num % 2 == 0)
		{
			System.out.println(num+"is even");
		}
		else
		{
			System.out.println(num+"is odd");
		}
	}
	public static void main(String[] args) {
		
		EvenOddByMethods t1 = new EvenOddByMethods ();
		t1.evenOdd(4);
		t1.evenOdd(9);
		t1.evenOdd(7);
		
		
	}

}

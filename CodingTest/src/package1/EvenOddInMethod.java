package package1;

public class EvenOddInMethod {
	
	

	void even(int a)
	{
		int num=0;
		if (a%2==0)
		{
			System.out.println("num is even");
		}
		else
		{
			System.out.println("num is odd");
		}
		
	}

	public static void main(String[] args) {
		EvenOddInMethod ob = new EvenOddInMethod();
		ob.even(4);
	}

}

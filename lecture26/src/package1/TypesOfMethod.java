package package1;

public class TypesOfMethod {

	// type 1
	
	void evenOdd()
	{
	int num = 4;
	{
		if(num % 2 ==0)
		{
			System.out.println("num is even");
		}
		else 
		{
			System.out.println("num is odd");
		}
	}
	}
	
	
	public static void main(String[] args) {
		TypesOfMethod ob = new TypesOfMethod ();
		ob.evenOdd();
	}

}

package Polymorohism;
class E 
{
	E ()
	{
		System.out.println("cons E");
	}
}
class E1 extends E
{
	E1 ()
	{
		System.out.println("cons E1");
	}
}

public class ConstructorOverride {

	public static void main(String[] args) {
		E1 ob = new E1 ();
		
	}
}

package Polymorohism;
class D
{
	D()
	{
		System.out.println("Calling cons D");
	}
}
class C extends D
{
	C ()
	{
		System.out.println("Calling cons C");
	}
}

public class ConstructorOverriding3 {

	public static void main(String[] args) {
		C ob = new C ();
		
	}

}

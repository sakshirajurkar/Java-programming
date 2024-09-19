package Polymorohism;
class A9 
{
	A9 ()
	{
		System.out.println("A9 cons.");
	}
}
class B9  extends A9
{
	B9 ()
	{
		System.out.println("B9 cons.");
	}
}
public class ConstructorOverriding2 {

	public static void main(String[] args) {
		B9 ob = new B9 ();
		
	}
}

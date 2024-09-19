package Polymorohism;
class A8 
{
	void m1 ()
	{
		System.out.println("Calling A8 ");
	}
}
class B8  extends A8
{
	void m1 ()
	{
		System.out.println("Calling B8 ");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		B8 ob = new B8 ();
		ob.m1();
	}

}

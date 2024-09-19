package Polymorohism;
class A1   //method overriding
{
	void m1 ()
	{
		System.out.println("in m1 method of class A1");
	}
}
class B1 extends A1
{
	void m1 ()
	{
		System.out.println("in m1 method of class B1");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		B1 ob = new B1();
		ob.m1();
	}

}

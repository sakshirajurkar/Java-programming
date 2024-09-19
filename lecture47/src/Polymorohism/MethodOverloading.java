package Polymorohism;
class A2   //Method Overloading
{
	void m1 ()
	{
		System.out.println("0-args method");
	}
	void m1 (int a)
	{
		System.out.println("1-args method");
	}
	void m1 (int a, int b)
	{
		System.out.println("2-args method");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		A2 ob = new A2 ();
		ob.m1();
		ob.m1(4);
		ob.m1(7,9);
	}

}

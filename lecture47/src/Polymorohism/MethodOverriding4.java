package Polymorohism;
class P1
{
	void m1()
	{
		System.out.println("calling m1 from class p1");
	}
}
class p2 extends P1
{
	void m1 ()
	{
		System.out.println("calling m1 from class p2");
	}
}

public class MethodOverriding4 {

	public static void main(String[] args) {
		p2 ob = new p2 ();
		ob.m1();
	}
}

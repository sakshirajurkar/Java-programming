package Polymorohism;
class R 
{
	void m1 ()
	{
		System.out.println("0-args method");
	}
}
class RR extends R
{
	void m1 (int a)
	{
		System.out.println("1-args method");
	}
}
class RRR extends RR
{
	void m1 (int a, int b)
	{
		System.out.println("3-args method");
	}
}

public class MethodOverloading6 {

	public static void main(String[] args) {
		RRR ob = new RRR();
		ob.m1();
		ob.m1(6);
		ob.m1(7,9);
	}

}

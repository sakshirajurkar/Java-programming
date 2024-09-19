package Inheritance;
class P // parent class
{
	void m1 ()
	{
		System.out.println("calling m1 from class P");
	}
}
class Q extends P // child class
{
	void m2 ()
	{
		System.out.println("calling m2 from class Q");
	}
}
class R extends P // child class
{
	void m3 ()
	{
		System.out.println("calling m3 from class R");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		R ob = new R();
		ob.m1();
		ob.m3();
		
		Q ob1 = new Q();
		ob1.m1();
		ob1.m2();
	}

}

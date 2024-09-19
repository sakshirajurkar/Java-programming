package Inheritance;
class D 
{
	void m1()
	{
		System.out.println("calling m1 from D class");
	}
}
class D1 extends D
{
	void m2()
	{
		System.out.println("calling m2 from D1 class");
	}
}
class D2 extends D
{
	void m3()
	{
		System.out.println("calling m3 from D2 class");
	}
}
public class HeiraricalInheritance {

	public static void main(String[] args) {
		D1 ob = new D1 ();
		ob.m1();
		ob.m2();
		
		D2 ob2 = new D2 ();
		ob2.m1();
		ob2.m3();
				
		
	}

}

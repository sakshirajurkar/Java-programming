package Inheritance;
class X  //grant parent class
{
	void m1 ()
	{
		System.out.println("Calling m1 from X class");
	}
}
class Y extends X   //parent class
{
	void m2 ()
	{
		System.out.println("Calling m2 from Y class");
	}
}
class Z extends Y  //child class
{
	void m3 ()
	{
		System.out.println("Calling m3 from Z class");
	}
}

public class MulitiInheritance {

	public static void main(String[] args) {
		Z ob = new Z();
		ob.m1();
		ob.m2();
		ob.m3();
		
	}

}

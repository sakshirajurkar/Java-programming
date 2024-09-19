package Inheritance;
class A0
{
	void m1 ()
	{
		System.out.println("Calling m1 from class A0");
	}
}
class B0 extends A0
{
	void m2 ()
	{
		System.out.println("Calling m2 from class B0");
	}
}
class C0 extends B0
{
	void m3 ()
	{
		System.out.println("Calling m3 from class C0");
	}
}

public class HierachicalInheritance4 {

	public static void main(String[] args) {
		B0 ob = new B0 ();
		ob.m1 ();
		ob.m2();
		
		C0 ob1 = new C0 ();
		ob1.m1();
		ob1.m3();
		
	}

}

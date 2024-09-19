package package1;
class A4
{
	void m1()
	{
		System.out.println("Parent class");
	}
}
class B4 extends A4
{
	void m2()
	{
		System.out.println("child class");
	}
}
class C4 extends A4
{
	void m3()
	{
		System.out.println("child class");
	}
}

public class HieraricalInheritance {

	public static void main(String[] args) {
		B4 ob = new B4 ();
		ob.m1();
		ob.m2();
		
		C4 ob1 = new C4();
		ob1.m1();
		ob1.m3();
	}
}

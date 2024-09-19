package Inheritance;
class A1  //parent class
{
	void m1 ()
	{
		System.out.println("Calling m1 from class A1");
	}
}
class B1 extends A1 //child class
{
	void m2 ()
	{
		System.out.println("Calling m2 from class  B1");
	}
}
class C1  extends A1  //child class
{
	void m3 ()
	{
		System.out.println("Calling m3 from class C1");
	}
}

public class HieraricalInheritance {

	public static void main(String[] args) {
		B1 ob = new B1();
		ob.m1();
		ob.m2();
		
		C1 ob2 = new C1();
		ob2.m1();
		ob2.m3();
		
	}

}

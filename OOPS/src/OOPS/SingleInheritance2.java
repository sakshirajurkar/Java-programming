package OOPS;
class A1
{
	void m1()
	{
		System.out.println("calling from m1");
	}
}
class B1  extends A1
{
	void m2()
	{
		System.out.println("calling from m2");
	}
}

public class SingleInheritance2 {

	public static void main(String[] args) {
		B1 ob = new B1();
		ob.m1();
		ob.m2();
	}
}

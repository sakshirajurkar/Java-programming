package package1;
class A3
{
	void m1()
	{
		System.out.println("Sakshi");
	}
}
class B3 extends A3
{
	void m2()
	{
		System.out.println("Ganesh");
	}
}
class C3 extends B3
{
	void m3()
	{
		System.out.println("Rajurkar");
	}
}

public class MultilavelInteritance {

	public static void main(String[] args) {
		C3 ob = new C3();
		ob.m1();
		ob.m2();
		ob.m3();
	}
}

package Inheritance;
class classC1
{
	void m1()
	{
		System.out.println("Calling m1 from classC1");
	}
}
class classC2 extends classC1
{
	void m2 ()
	{
		System.out.println("Calling m2 from classC2");
	}
}
class classC3 extends classC2
{
	void m3 ()
	{
		System.out.println("Calling m3 from classC3");
	}
}

public class MultilavelInheritance7 {

	public static void main(String[] args) {
		classC3 ob = new classC3 ();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

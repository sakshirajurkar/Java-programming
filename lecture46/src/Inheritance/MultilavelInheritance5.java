package Inheritance;
class classA
{
	void m1 ()
	{
		System.out.println("calling m1 from classA");
	}
}
class classB extends classA
{
	void m2 ()
	{
		System.out.println("calling m2 from classB");
	}
}
class classC extends classB
{
	void m3 ()
	{
		System.out.println("calling m3 from classC");
	}
}

public class MultilavelInheritance5 {

	public static void main(String[] args) {
		classC ob = new classC();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

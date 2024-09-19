package abstraction;
abstract class Z
{
	abstract void m1();
	abstract void m2();
}

public class AbstractClass extends Z {
	void m1 ()
	{
		System.out.println("m1() method");
	}
	void m2()
	{
		System.out.println("m2() method");
	}

	public static void main(String[] args) {
		AbstractClass ob = new AbstractClass ();
		ob.m1();
		ob.m2();
	}

}

package package1;
abstract class A7
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("normal method");
	}
	
}

public class AbstractClass extends A7{
     
	void m1()
	{
		System.out.println("abstract method-1");
	}
	void m2()
	{
		System.out.println("abstract method-2");
	}
	public static void main(String[] args) {
		AbstractClass  ob = new AbstractClass ();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

package package1;
class A 
{
	void m1() {
		System.out.println("Base class method");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Child class method");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		B ob = new B ();
		ob.m1();
		ob.m2();
	}
}

package package1;
class A1
{
	void m1()
	{
		System.out.println("Calling class A");
	}
	
}
class B1 extends A1
{
	void m2()
	{
		System.out.println("calling class B");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		B1 ob = new B1();
		ob.m1();
		ob.m2();
	}

}

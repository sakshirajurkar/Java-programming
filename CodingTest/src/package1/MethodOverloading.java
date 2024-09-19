package package1;
class A
{
	void m1 ()
	{
		System.out.println("no args method");
	}
	void m1 (int m1 )
	{
		System.out.println("one args method");
	}
	void m1 (int a, int b)
	{
		System.out.println("two args method");
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		A ob = new A ();
		ob.m1();
		ob.m1(6);
		ob.m1(7,9);
	}

}

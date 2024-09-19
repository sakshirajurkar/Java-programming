package package1;
class A5
{
	void m1()
	{
		System.out.println("No args method");
	}
	void m1(int a)
	{
		System.out.println("one args method");
	}
	void m1(int a, int b)
	{
		System.out.println("Two args method");
	}
}
public class MethodOverloading1 {

	public static void main(String[] args) {
		A5 ob = new A5();
		ob.m1();
		ob.m1(7);
		ob.m1(6,8);
	}
}

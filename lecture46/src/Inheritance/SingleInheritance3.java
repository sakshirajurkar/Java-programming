package Inheritance;
class A11 {
	void m1 ()
	{
		System.out.println("0-args method");
	}
	void m1 (int a)
	{
		System.out.println("1-args method");
	}
	void m1 (int a, int b)
	{
		System.out.println("2-args method");
	}
}

public class SingleInheritance3 {

	public static void main(String[] args) {
		A11 ob = new A11();
		ob.m1();
		ob.m1(5);
		ob.m1(2,8);
	}
}

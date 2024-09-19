package Polymorohism;
class T
{
	void m1()
	{
		System.out.println("0-args method");
	}
	void m1(int a)
	{
		System.out.println("1-args method");
	}
	void m1 (int a, int b)
	{
		System.out.println("2-args method");
	}
}

public class MethodOverloading8 {

	public static void main(String[] args) {
		T ob = new T ();
		ob.m1();
		ob.m1(8);
		ob.m1(5, 6);
	}

}

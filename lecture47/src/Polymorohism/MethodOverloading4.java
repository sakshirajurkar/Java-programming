package Polymorohism;
class S 
{
	void m1 ()
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

public class MethodOverloading4 {

	public static void main(String[] args) {
		S ob = new S ();
		ob.m1();
		ob.m1(1);
		ob.m1(5,9);
	}

}

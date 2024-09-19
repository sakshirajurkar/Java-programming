package Polymorohism;
class A6 {
	void m1 ()
	{
		System.out.println("Calling 0-args method ");
	}
	void m1 (int a)
	{
		System.out.println("Calling 1-args method ");
	}
	void m1 (int a, int b)
	{
		System.out.println("Calling 2-args method ");
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		A6 ob = new A6();
		ob.m1();
		ob.m1(2,9);
		ob.m1(5);
	}

}

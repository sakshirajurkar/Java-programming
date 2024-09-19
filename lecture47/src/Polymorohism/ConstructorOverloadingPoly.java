package Polymorohism;
class A    //constructor overloading
{
	A ()
	{
		System.out.println("calling 0-args constructor");
	}
	A (int a)
	{
		System.out.println("calling 1-args constructor");
	}
	A (int a, int b)
	{
		System.out.println("calling 2-args constructor");
	}
	
}

public class ConstructorOverloadingPoly {

	public static void main(String[] args) {
		A t1 = new 	A();
		A t2 = new A(12);
		A t3 = new A(32,43);
	}

}

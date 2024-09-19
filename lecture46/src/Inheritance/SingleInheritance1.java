package Inheritance;
class A3 {
	int num1 = 24;
	void m1 ()
	{
		System.out.println("Hello");
	}
}
class B3 extends A3 {
	int num2 = 4;
	void m2 ()
	{
		System.out.println("Welcome");
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		B3 ob = new B3 ();
		System.out.println(ob.num1);
		System.out.println(ob.num2);
        ob.m1();
        ob.m2();
	}
}

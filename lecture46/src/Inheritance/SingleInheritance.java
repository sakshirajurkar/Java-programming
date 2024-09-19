package Inheritance;
class A2 {
	void m1 ()
	{
		System.out.println("Calling m1 from A2 class");
	}
}
class B2 extends A2 {
	void m2 ()
	{
		System.out.println("Calling m2 from B2 class");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		A2 a = new A2(); //A2 class 
		a.m1();
		
		
		B2 b = new B2(); // B2 class
		b.m1();
		b.m2();
		
	}
}

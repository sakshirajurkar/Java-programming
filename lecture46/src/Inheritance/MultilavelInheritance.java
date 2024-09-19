package Inheritance;
class A7 {
	void m1 () 
	{
		System.out.println("Calling m1 from A7 class");
	}
}
class B7  extends A7{
	void m2 ()
    {
		System.out.println("Calling m2 from B7 class");
	}
}
class C7 extends B7{
	void m3 ()
	{
		System.out.println("Calling m3 from C7 class");
	}
}

public class MultilavelInheritance {

	public static void main(String[] args) {
		C7 ob = new C7();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

package Polymorohism;
class A4 {   //method overriding
	void m1 ()
	{
		System.out.println("Calling m1 from class A4");
	}
}
class B4 extends A4 {
	void m1 ()
	{
		System.out.println("Calling m1 from class B4");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		B4 ob = new B4 ();
		ob.m1();
		
	}

}

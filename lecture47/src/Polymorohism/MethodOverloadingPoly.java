package Polymorohism;
class test {    // method overloading //
	void m1 ()
	{
		System.out.println("calling m1 () from test class");
	}
	void m2 (int a) {
		System.out.println("calling m2 () from test class");
	}
	void m3 (int a, int b) {
		System.out.println("calling m3 () from test class");
	}
}

public class MethodOverloadingPoly {

	public static void main(String[] args) {
		test ob = new test();
		ob.m1();
		ob.m2(7);
		ob.m3(4, 8);
	}
}

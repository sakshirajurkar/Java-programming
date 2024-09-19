package Inheritance;
class A9 {
	void m1 () {
		System.out.println("Hello");
	}
}
class B9 extends A9 {
	void m2 () {
		System.out.println("World");
	}
}
class C9 extends A9 {
	void m3 () {
		System.out.println("Java");
	}
}

public class HierarichalInheritance {

	public static void main(String[] args) {
		B9 ob = new B9();
		ob.m1();
		ob.m2();
		
		C9 ob2 = new C9();
		ob2.m1();
		ob2.m3();
		
		
		
		
	}

}

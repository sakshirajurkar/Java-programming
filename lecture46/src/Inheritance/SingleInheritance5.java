package Inheritance;
class A5 {
	int num1 = 23;
	void m1 () {
		System.out.println("Hello");
	}
}
class B5 extends A5{
	int num2 = 6;
	void m2 () {
		System.out.println("Welcome");
	}
}

public class SingleInheritance5 {

	public static void main(String[] args) {
		B5 ob = new B5();
		System.out.println(ob.num1);
		System.out.println(ob.num2);
		ob.m1();
		ob.m2();
	}

}

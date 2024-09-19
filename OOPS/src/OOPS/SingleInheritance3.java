package OOPS;

class A2 {
	void m1() {
		System.out.println("Parent class");
	}
}

class B2 extends A2 {
	void m2() {
		System.out.println("child class");
	}
}

public class SingleInheritance3 {
	public static void main(String[] args) {
    B2 ob = new B2() ;
    ob.m1();
    ob.m2();
	}
}

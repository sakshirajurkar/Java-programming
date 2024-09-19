package Inheritance;

class class1 {
	void m1() {
		System.out.println("0-args method");
	}
}

class class2 extends class1 {
		void m2() {
			System.out.println("1-args method");
		}
	}

	public class SingleInheritan6 {

	public static void main(String[] args) {
		class2 ob = new class2();
		ob.m1();
		ob.m2();
		
		
	}
}

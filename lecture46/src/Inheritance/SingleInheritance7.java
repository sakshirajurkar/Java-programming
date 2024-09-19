package Inheritance;

class A10 {
	int num1 = 24;

	void m1() {
		System.out.print("Age");
	}
}
class B10 extends A10{
	int num2 = 101;
	void m2 () {
		System.out.print("ID");
	}
}

public class SingleInheritance7 {

	public static void main(String[] args) {
         B10 ob = new B10();
         ob.m1();
         System.out.println(" :"+ob.num1);
         ob.m2();
         System.out.println("  :"+ob.num2);
	}

}

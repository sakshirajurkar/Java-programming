package Inheritance;
class A{      //parent / super / base
	int num1 = 20;
	void show ()
	{
		System.out.println("Hello");
	}
}
class B extends A {   //child / sub / derived
	int num2 = 5;
	void display ()
	{
		System.out.println("Welcome");
	}
}

public class SingleInheritance4 {

	public static void main(String[] args) {
		A a = new A();   //calling parent class element
		System.out.println(a.num1);
		a.show();
		
		B b = new B ();  //calling child class element
		System.out.println(b.num1);
		System.out.println(b.num2);
		b.show();
		b.display();
	}

}

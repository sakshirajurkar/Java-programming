package Inheritance;
class A4 {
	String vehicalType ;
}
class B4 extends A4{
	String modelType ;
	void m1 () {
		System.out.println( vehicalType + "  " + modelType);
	}
}

public class SingleInheritance2 {

	public static void main(String[] args) {
		B4 ob = new B4 ();
		ob.vehicalType = "Car";
		ob.modelType = "SportsCar";
		ob.m1();
	}

}

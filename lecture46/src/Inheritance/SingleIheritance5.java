package Inheritance;
class A6 {
	String vehicalType;
}
class B6 extends A6 {
	String modelType;
	
	void m1 () {
		System.out.println(vehicalType + " " + modelType);
	}
}

public class SingleIheritance5 {
	public static void main(String[] args) {
		B6 ob = new B6();
		ob.vehicalType = "Car";
		ob.modelType = "SportsCar";
		ob.m1();
	}

	

}

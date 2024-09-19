package Inheritance;
class A12 
{
	String vehicalType;
	
}
class B12 extends A12
{
	String modelType;
	void m1 ()
	{
		System.out.println(vehicalType + " " + modelType);
	}
}

public class SingleInheritance6 {

	public static void main(String[] args) {
		B12 ob = new B12 ();
		ob.vehicalType = "Car";
		ob.modelType = "sportsCar";
		ob.m1();
	}

}

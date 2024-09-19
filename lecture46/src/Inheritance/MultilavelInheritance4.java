package Inheritance;
class X1  // grand parent class 
{
	void m1 ()
	{
		System.out.println("Caling m1 from class x");
	}
}
class Y1 extends X1  // parent class
{
	void m2 ()
	{
		System.out.println("Caling m2 from class y");
	}
}
class Z1 extends Y1  //child class
{
	void m3 ()
	{
		System.out.println("Caling m3 from class z");
	}
}
public class MultilavelInheritance4 {

	public static void main(String[] args) {
		Z1 ob = new Z1 ();
		ob.m1();
		ob.m2();
		ob.m3();
		
	}

}

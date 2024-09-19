package Inheritance;
class classx 
{
	void m1()
	{
		System.out.println("Calling m1 from classx");
	}
}
class classY extends classx
{
	void m2 ()
	{
		System.out.println("Calling m2 from classY");
	}
}

public class SingleInheritance8 {

	public static void main(String[] args) {
		classY ob = new classY ();
		ob.m1();
		ob.m2();
	}

}

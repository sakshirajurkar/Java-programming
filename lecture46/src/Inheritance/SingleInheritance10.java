package Inheritance;
class V 
{
	void m1()
	{
		System.out.println("calling m1 from class V");
	}
}
class V1 extends V
{
	void m2 ()
	{
		System.out.println("calling m2 from class V1");
	}
}

public class SingleInheritance10 {

	public static void main(String[] args) {
		V1 ob = new V1();
	    ob.m1();
	    ob.m2();
	}

}

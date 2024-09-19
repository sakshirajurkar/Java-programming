package Inheritance;
class K 
{
	void m1 ()
	{
		System.out.println("calling m1 from class K");
	}
}
class K1 extends K
{
	void m2 ()
	{
		System.out.println("calling m2 from class K1");
	}
}
class K2 extends K1
{
	void m3 ()
	{
		System.out.println("calling m3 from class K2");
	}
}

public class MultilavelInheritance10 {

	public static void main(String[] args) {
		K2 ob = new K2 ();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

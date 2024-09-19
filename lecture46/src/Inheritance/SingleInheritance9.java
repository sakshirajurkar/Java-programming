package Inheritance;
class I 
{
	void m1 ()
	{
		System.out.println("calling m1 from class I");
	}
}
class II extends I
{
	void m2 ()
	{
		System.out.println("calling m2 from class II");
	}
}

public class SingleInheritance9 {

	public static void main(String[] args) {
		II ob = new II ();
		ob.m1();
		ob.m2();
	}
}

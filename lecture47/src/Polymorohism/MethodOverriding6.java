package Polymorohism;
class B
{
	void m1 ()
	{
		System.out.println("calling m1 from class B");
	}
}
class BB extends B
{
	void m1 ()
	{
		System.out.println("calling m1 from class BB");
	}
}
public class MethodOverriding6 {

	public static void main(String[] args) {
		BB ob = new BB ();
		ob.m1();
	}

}

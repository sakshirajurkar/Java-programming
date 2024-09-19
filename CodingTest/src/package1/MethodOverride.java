package package1;
class C 
{
	void m1 ()
	{
		System.out.println("m1 from C class");
	}
}
class C1 extends C
{
	void m1 ()
	{
		System.out.println("m1 from C1 class");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		C1 ob = new C1 ();
		ob.m1();
	}

}

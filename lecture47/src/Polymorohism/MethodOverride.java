package Polymorohism;
class J
{
	void m1 ()
	{
		System.out.println("method m1 from class R");
	}
}
class J1 extends J
{
	void m1 ()
	{
		System.out.println("method m1 from class R1");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		J1 ob = new J1();
		ob.m1();
	}

}

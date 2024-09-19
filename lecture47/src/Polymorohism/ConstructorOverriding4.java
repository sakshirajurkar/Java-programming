package Polymorohism;
class Y1
{
	Y1 ()
	{
		System.out.println("Y1 cons calling");
	}
}
class Y2 extends Y1
{
	Y2 ()
	{
		System.out.println("Y2 cons calling");
	}
}

public class ConstructorOverriding4 {

	public static void main(String[] args) {
		Y2 ob = new Y2 ();
	}
}

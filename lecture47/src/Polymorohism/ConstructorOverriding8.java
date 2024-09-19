package Polymorohism;
class cons1
{
	cons1 ()
	{
		System.out.println("calling cons 1 ");
	}
}
class cons2 extends cons1
{
	cons2()
	{
		System.out.println("calling cons 2");
	}
}

public class ConstructorOverriding8 {

	public static void main(String[] args) {
		cons2 ob = new cons2();
	}
}

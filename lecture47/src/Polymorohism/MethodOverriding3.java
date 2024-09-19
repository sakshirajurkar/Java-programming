package Polymorohism;
class classC
{
	void m1 ()
	{
		System.out.println("calling m1 from classA");
	}
}
class classB extends classC
{
	void m1 ()
	{
		System.out.println("calling m2 from classB");
	}
}

public class MethodOverriding3 {

	public static void main(String[] args) {
		classB ob = new classB();
		ob.m1();
	}

}

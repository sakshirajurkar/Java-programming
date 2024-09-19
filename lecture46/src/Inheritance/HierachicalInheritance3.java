package Inheritance;
class classP
{
	void m1 ()
	{
		System.out.println("calling m1 from classP");
	}
}
class classQ extends classP
{
	void m2 ()
	{
		System.out.println("calling m2 from classQ");
	}
}
class classR extends P
{
	void m3 ()
	{
		System.out.println("calling m3 from classQ");
	}
}

public class HierachicalInheritance3 {

	public static void main(String[] args) {
		classQ ob = new classQ();
		ob.m1();
		ob.m2();
		
		classR ob1 = new classR();
		ob1.m1();
		ob1.m3();
	}

}

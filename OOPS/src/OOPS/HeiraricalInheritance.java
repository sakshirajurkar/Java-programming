package OOPS;
class p
{
	void m1()
	{
		System.out.println("calling from p class");
	}
}
class q extends p
{
	void m2()
	{
       System.out.println("calling from q class");
	}
}
class r extends p
{
	void m3()
	{
		System.out.println("calling from r class");
	}
}

public class HeiraricalInheritance {

	public static void main(String[] args) {
		q ob = new q();
		ob.m1();
		ob.m2();
		
		r ob1 = new r();
		ob1.m1();
		ob1.m3();
	}
}

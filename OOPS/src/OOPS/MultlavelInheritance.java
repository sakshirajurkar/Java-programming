package OOPS;
class c
{
	 void m1()
	 {
		 System.out.println("calling from c class");
	 }
}
class d extends c
{
	void m2()
	{
		System.out.println("calling from d class");
	}
}
class e extends d
{
	void m3()
	{
		System.out.println("calling from e class");
	}
}
public class MultlavelInheritance {

	public static void main(String[] args) {
		e ob = new e();
		ob.m1();
		ob.m2();
		ob.m3();
		
	}
}

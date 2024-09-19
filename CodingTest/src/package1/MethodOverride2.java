package package1;
class A6  
{
	void m1()
	{
		System.out.println("calling A6 class");
	}
}
class B6 extends A6
{
	void m1()
	{
		System.out.println("calling B6 class");
	}
}
public class MethodOverride2 {

	public static void main(String[] args) {
		B6 ob = new B6();
		ob.m1();
	}

}

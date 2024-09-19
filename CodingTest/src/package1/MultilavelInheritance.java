package package1;
class manager
{
	void m1 ()
	{
		System.out.println("calling m1 from class manager");
	}
}
class Employee extends manager
{
	void m2()
	{
		System.out.println("calling m2 from class employee");
	}
}
class developer  extends Employee
{
	void m3()
	{
		System.out.println("calling m3 from class Developer");
	}
}

public class MultilavelInheritance {

	public static void main(String[] args) {
		developer ob = new developer ();
		ob.m1();
		ob.m2();
		ob.m3();
				
	}

}

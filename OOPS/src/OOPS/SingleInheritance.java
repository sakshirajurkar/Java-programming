package OOPS;
//single inheritance
class A{
	String name;
	int salary;
}
class B extends A
{
	
	void m1()
	{
		System.out.println(name + "- " + salary);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		B ob = new B();
		ob.name=("Aviral");
		ob.salary=(540000);
		ob.m1();
		
	}
}

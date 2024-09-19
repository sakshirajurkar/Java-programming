package package1;
class A2
{
	String name;
}
class B2 extends A2
{
	String surname;
	
	void m1()
	{
		System.out.println(name + " " + surname);
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		B2 ob = new B2();
		ob.name = ("Sakshi");
		ob.surname = ("Rajurkar");
		ob.m1();
	}

}

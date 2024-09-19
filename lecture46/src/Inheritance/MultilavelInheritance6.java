package Inheritance;
class name  //grand parent class
{
	String name ;
}
class fathername extends name  // parent class
{
	String fatherName;
}
class surname extends fathername  // child class
{
	String surname;
	void m1 ()
	{
		System.out.println(name + " " + fatherName + " " +surname);
	}
}

public class MultilavelInheritance6 {

	public static void main(String[] args) {
		surname ob = new surname ();
		ob.name = "Pritam";
		ob.fatherName = "Tukaram";
		ob.surname = "Kale";
		ob.m1();
	}

}

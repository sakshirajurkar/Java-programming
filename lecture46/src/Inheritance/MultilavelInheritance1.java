package Inheritance;
class A8 {   
	String name ;
	
}
class B8 extends A8{
	String fatherName;
}
class C8 extends B8{
	String surname ;
	
	void m1 ()
	{
		System.out.println(name + " " + fatherName + " " + surname );
	}
}

public class MultilavelInheritance1 {

	public static void main(String[] args) {
		C8 ob =  new C8();
		ob.name = "Sakshi";
		ob.fatherName = "Ganesh";
		ob.surname = "Rajurkar";
		ob.m1();
	}

}

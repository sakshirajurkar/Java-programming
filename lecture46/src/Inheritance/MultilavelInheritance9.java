package Inheritance;
class n1 {
	String name ;
	
}
class f1 extends n1 {
	String fatherName  ;
}
class s1 extends f1{
	String surname ;
	
	void m1 ()
	{
		System.out.println(name + " " + fatherName + " " + surname);
	}
}

public class MultilavelInheritance9 {
	public static void main(String[] args) {
		s1 ob = new s1 ();
		ob.name = "Vaibhav";
		ob.fatherName = "Ganesh";
		ob.surname = " Rajurkar";
		ob.m1();
		
	}
	

}

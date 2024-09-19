package Polymorohism;
class A5 {   //construcot can not override 
	A5 ()
	{
		System.out.println("A5 constructor");
	}
}
class B5  extends A5{
	B5 ()
	{
		System.out.println("B5 constructor");
	}
}

public class ConstructorOverriding {

	public static void main(String[] args) {
		B5 ob = new B5 ();
		
	}

}

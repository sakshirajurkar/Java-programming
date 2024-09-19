package Polymorohism;
class F 
{
	F ()
	{
		System.out.println("no args cons");
	}
	F(int a)
	{
		System.out.println("one args cons");
	}
	F (int a, int b )
	{
		System.out.println("two args cons");
	}
}

public class ConstructorOverloading7 {

	 public static void main(String[] args) {
		F ob = new F ();
		F ob1 = new F (7);
		F ob2 = new F (4,9);
	}
	 

}

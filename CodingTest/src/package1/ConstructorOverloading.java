package package1;
class B 
{
	B()
	{
		System.out.println("no args cons");
	}
	B (int a) 
	{
		System.out.println("one args cons");
	}
	B(int a, int b)
	{
		System.out.println("two args cons");
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		B ob = new B ();
		B ob1 = new B (2);
		B ob2 = new B (7,5);
	}

}

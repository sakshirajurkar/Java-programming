package Polymorohism;
class D1
{
	D1()
	{
		System.out.println("0-args constructor");
	}
	D1(int a)
	{
		System.out.println("1-args constructor");
	}
	D1(int a, int b )
	{
		System.out.println("2-args constructor");
	}
}


public class ConstructorOverloading3 {

	public static void main(String[] args) {
		D1 ob = new D1 ();
		D1 ob1 = new D1 (3);
		D1 ob2 = new D1 (2,4);
	}

}

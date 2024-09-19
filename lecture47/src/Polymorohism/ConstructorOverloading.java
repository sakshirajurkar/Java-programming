package Polymorohism;
class A3{  //constructor overloading
	A3()
	{
		System.out.println("0-args constructor");
	}
	A3(int a)
	{
		System.out.println("1-args constructor");
	}
	A3 (int a, int b)
	{
		System.out.println("2-args constructor");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		A3 ob = new A3 ();
		A3 ob2 = new A3 (23);
		A3 ob3 = new A3 (21,9);
	}

}

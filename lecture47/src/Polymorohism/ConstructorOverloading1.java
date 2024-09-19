package Polymorohism;
class A7 {
	A7 ()
	{
		System.out.println("0-args cons ");
	}
	A7(int a)
	{
		System.out.println("1-args cons ");
	}
	A7 (int a, int b)
	{
		System.out.println("2-args cons");
	}

}
public class ConstructorOverloading1 {

	public static void main(String[] args) {
		A7 ob = new A7 ();
		A7 ob1 = new A7(1);
		A7 ob2 = new A7 (3,2);
	}

}

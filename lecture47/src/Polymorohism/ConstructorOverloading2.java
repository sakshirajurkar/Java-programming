package Polymorohism;
class ConsOverloading
{
	ConsOverloading ()
	{
		System.out.println("0-args cons");
	}
	ConsOverloading(int a)
	{
		System.out.println("1-args cons");
	}
	ConsOverloading(int a, int b)
	{
		System.out.println("2-args cons");
	}
}

public class ConstructorOverloading2 {

	public static void main(String[] args) {
		ConsOverloading ob = new ConsOverloading();
		ConsOverloading ob1 = new ConsOverloading(1);
		ConsOverloading ob2 = new ConsOverloading (4,9);
		
	}

}

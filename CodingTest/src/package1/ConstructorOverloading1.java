package package1;
class cons1
{
	cons1()
	{
		System.out.println("zero args cons");
	}
	cons1(int a)
	{
		System.out.println("one args cons");
	}
	cons1(int a, int b)
	{
		System.out.println("two args cons");
	}
}

public class ConstructorOverloading1 {

	public static void main(String[] args) {
		cons1 ob = new cons1();
		cons1 ob2 = new cons1(6);
		cons1 ob3 = new cons1(5,9);
		
	}
}

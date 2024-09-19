package lecture32;

public class  ConstructorChaining1{
	
	int i;
	
	ConstructorChaining1()
	{
		this(0);
		i = 0;
		System.out.println("This is an zero parameter constructor");
	}
	ConstructorChaining1(int h)
	{
		this(6,9);
		System.out.println("This is an one parameter constructor");
	}
	ConstructorChaining1(int h, int a)
	{
		this(8,7,9);
		System.out.println("This is an two parameter constructor");
	}
	ConstructorChaining1(int h, int a, int b)
	{
		System.out.println("This is an three parameter constructor");
	}
	
	

	public static void main(String[] args) {
		ConstructorChaining ob = new ConstructorChaining();
		
	}
}

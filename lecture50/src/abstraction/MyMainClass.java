package abstraction;
abstract class Test
{
	abstract void display ();
	abstract void show ();
	
}

public class MyMainClass extends Test {
	@Override
	void display ()
	{
		System.out.println("Hello from display method");
	}
	@Override
	void show ()
	{
		System.out.println("Hello from show method");
	}
	public static void main(String[] args) {
		MyMainClass ob = new MyMainClass();
				ob.display();
				ob.show();
		
	}

}

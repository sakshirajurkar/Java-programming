package Inheritance;
class G //parent class
{
	void m1 ()
	{
		System.out.println("Calling m1 from class G");
	}
}
class GG  extends G//child class
{
	void m2 ()
	{
		System.out.println("Calling m2 from class GG");
	}
}
class GGG   extends G//child class
{
	void m3 ()
	{
		System.out.println("Calling m3 from class GGG");
	}
}

public class HierarichalInheritance7 {

	public static void main(String[] args) {
		GGG ob = new GGG ();
		ob.m1();
		ob.m3();
		
		GG ob1 = new GG ();
		ob1.m1();
		ob1.m2();
		
	}

}

package abstraction;
interface Y1 
{
	void m1 ();
	
}
interface Y2 
{
	void m2 ();
}
interface Y3 extends Y1, Y2  //multiple inheritance
{
	void m3 ();
}

public class MainClass implements Y3 {
	public void m1 ()
	{
		System.out.println("From class Y1");
	}
	public void m2 ()
	{
		System.out.println("From class Y2");
	}
	public void m3 ()
	{
		System.out.println("From class Y3");
	}

	public static void main(String[] args) {
		MainClass ob = new MainClass ();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

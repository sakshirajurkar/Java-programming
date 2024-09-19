package package1;
interface A 
{
	void m1 ();
	void m2 ();
}
interface B 
{
	void m2 ();
	void m4 ();
	void m5 ();
}
interface C extends A, B 
{
	
}

public class MainClass implements C {
	public void m1 ()
	{
		System.out.println("Hello from m1()");
	}
	public void m2 ()
	{
		System.out.println("Hello from m2()");
	}
	public void m3 ()
    {
    	System.out.println("Hello from m3()");
    }
	public void m4 ()
    {
    	System.out.println("Hello from m4()");
    }
	public void m5 ()
    {
    	System.out.println("Hello from m5()");
    }
	public static void main(String[] args) {
		MainClass ob = new MainClass ();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
		ob.m5();
	}
}

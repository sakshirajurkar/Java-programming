package abstraction;
interface H
{
	void m1 ();
	void m2 ();
}


public class Interfeace implements H{
     public void m1()
     {
    	 System.out.println("m1() method");
     }
     public void m2 ()
     {
    	 System.out.println("m2() method" );
     }
	public static void main(String[] args) {
		Interfeace ob = new Interfeace ();
		ob.m1();
		ob.m2();
	}
}

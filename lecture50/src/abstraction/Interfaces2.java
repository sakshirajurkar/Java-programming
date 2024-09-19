package abstraction;
interface G 
{
	void m1 ();
}
interface G1 
{
	void m2 ();
}

public class Interfaces2 implements G {
    public void m1 ()
     {
    	 System.out.println("m1 calling");
     }
    public void m2 ()
    {
    	System.out.println("m2 calling");
    }
	public static void main(String[] args) {
		Interfaces2 ob = new Interfaces2 ();
		ob.m1();
		ob.m2();
	}

}

package abstraction;
interface O
{
	void m1();
	void m2();
}
interface O1
{
	void m3();
	void m4();
}
interface O2 extends O,O1
{
	void m5();
}

public class Interfacec1 implements O2 {
     public void m1()
     {
    	 System.out.println("m1 method");
     }
     public void m2()
     {
    	 System.out.println("m2 method");
     }
     public void m3 ()
     {
    	 System.out.println("m3 method");
     }
     public void m4 ()
     {
    	 System.out.println("m4 method");
     }
     public void m5 ()
     {
    	 System.out.println("m5 method");
     }
	public static void main(String[] args) {
		Interfacec1 ob = new Interfacec1();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
		ob.m5();
		
	}

}

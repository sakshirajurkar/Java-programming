package abstraction;
abstract class Q 
{
	abstract void m1();
	abstract void m2();
}	

public class AbstractClass1 extends Q {
      public void m1 () 
      {
    	  System.out.println("m1 method ");
      }
      public void m2 ()
      {
    	  System.out.println("m2 method");
      }
	public static void main(String[] args) {
		AbstractClass1 ob = new AbstractClass1 ();
		ob.m1();
		ob.m2();
	}

}

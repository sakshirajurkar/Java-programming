package OOPS;
interface w
{
	abstract void m1();
		
}
public class AbstractInterface implements w{
      public void m1()
      {
    	  System.out.println("interface");
      }
	public static void main(String[] args) {
		AbstractInterface ob = new AbstractInterface();
		ob.m1();
	}
}

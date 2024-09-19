package OOPS;
abstract class z
{
	abstract void m1();
	void m2() {
		System.out.println("normal method");
	}
}

public class AbstractCls extends z {
     public void m1()
     {
    	 System.out.println("abstract class");
     }
     
	public static void main(String[] args) {
		AbstractCls ob = new AbstractCls();
		ob.m1();
		ob.m2();
	}
}

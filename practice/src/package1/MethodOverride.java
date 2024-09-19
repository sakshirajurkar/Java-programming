package package1;
class mtd1
{
	void m1()
	{
		System.out.println("hello from m1");
	}
}
class mtd2 extends mtd1
{
	void m1()
	{
		System.out.println("hello from m2");
	}
}
public class MethodOverride {
    public static void main(String[] args) {
	   mtd2 ob = new mtd2 ();
	   ob.m1();
    }
}

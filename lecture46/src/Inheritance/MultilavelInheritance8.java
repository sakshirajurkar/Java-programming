package Inheritance;
class Q1  // grand parent class
{
	void m1 ()
	{
		System.out.println("calling m1 from class Q");
	}
}
class QQ extends Q1 //parent class
{
	void m2 ()
	{
		System.out.println("calling m2 from class QQ");
	}
}
class QQQ extends QQ //child class
{
	void m3 ()
	{
		System.out.println("calling m3 from class QQQ");
	}
}

public class MultilavelInheritance8 {

	public static void main(String[] args) {
		QQQ ob =  new QQQ();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

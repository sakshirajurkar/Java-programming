package package1;
class AA 
{
	void display1 ()
	{
		System.out.println("This is class-1");
	}
}
class BB
{
	void display2 ()
	{
		System.out.println("This is class-2");
	}
}
class CC 
{
	void display3 ()
	{
		System.out.println("This is class-3");
	}
}

public class ThreeClass {

	public static void main(String[] args) {
		AA ob1 = new AA();
		ob1.display1();
		
		BB ob2 = new BB();
		ob2.display2();
		
		CC ob3 = new CC();
		ob3.display3();
	}

}

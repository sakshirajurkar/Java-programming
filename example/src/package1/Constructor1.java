package package1;
public class Constructor1 {
	int value1;
	int value2;
	
	Constructor1(){
		value1 = 10;
		value2 = 20;
		System.out.println("Inside 1st Constructor");
	}
	Constructor1 (int a)
	{
		value1 = a;
		System.out.println("Inside 2nd Construcor");
	}
	Constructor1 (int a, int b)
	{
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd Constructor");
	}
	public void display ()
	{
		System.out.println("value1 ==" + value1);
		System.out.println("value2 ==" + value2);
	}

	public static void main(String[] args) {
		Constructor1 ob = new Constructor1 ();
		Constructor1 ob1 = new Constructor1 ();
		Constructor1 ob2 = new Constructor1 ();
		ob.display();
		ob1.display();
		ob2.display();
	}

}

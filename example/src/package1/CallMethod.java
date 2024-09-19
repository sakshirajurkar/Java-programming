package package1;
public class CallMethod {
	int a;
	float b;
	String str;
	 
	public void operation1 () {
		a = 10;
		b = 15.8f;
		str = " Java";
	}
	public void operation2 () {
		a = 20;
		b = 26f;
		str = " SELENIUM";
	}
	public void display()
	{
		System.out.println("The integer value is:" + a);
		System.out.println("The float value is:" + b);
		System.out.println("The string value is" + str);
	}

	public static void main(String[] args) {
		 CallMethod ob = new  CallMethod ();
		 ob.operation1();
		 ob.display();
		 ob.operation2();
		 ob.display();
	}

}

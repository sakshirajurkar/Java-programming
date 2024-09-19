package package1;

public class ParameterizedConstructor {

	//instance varaible 
	int a;
	int b;
	int c;
	
	//parameterized cons.
	ParameterizedConstructor ()
	{
		a = 7;
		b = 5;
		c = 7;
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		 ParameterizedConstructor ob = new  ParameterizedConstructor();
	}
	

}

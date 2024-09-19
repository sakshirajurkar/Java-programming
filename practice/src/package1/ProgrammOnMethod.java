package package1;

public class ProgrammOnMethod {
	void method()
	{
		int a= 4;
		int b = 4;
		int result = a+b;
		System.out.println("This is a method 0: "+result);
	}
	void method1(int a, int b)
	{
		int res = a+b;
		System.out.println("This is a method 1: "+res);
	}
	int method2()
	{
		int a = 6;
		int b = 4;
		int result = a+b;
		return result;
	}
	int method3(int a, int b )
	{
		int res = a+b;
		return res;
	}

	public static void main(String[] args) {
		ProgrammOnMethod ob = new ProgrammOnMethod();
		ob.method();
		ob.method1(6,8);
		int result = ob.method2();
		System.out.println("This is method 3: "+result);
		int res = ob.method3(3,9);
		System.out.println("This is a method 3: "+result);
		
	}

}

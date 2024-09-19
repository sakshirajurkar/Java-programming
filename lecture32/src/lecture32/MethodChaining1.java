package lecture32;

public class MethodChaining1 {
	int a;
	
	void method()
	{
		this.method(1);
		System.out.println("Method 1");
	}
	void method(int a)
	{
		this.method(6,9);
		System.out.println("Method 2");
	}
	void method(int a, int b)
	{
		this.method(6,87,98);
		System.out.println("Method 3");
	}
    void method(int a, int b, int c)
    {
    	System.out.println("Method 4");
    }
	public static void main(String[] args) {
		MethodChaining1 ob1 = new MethodChaining1();
		ob1.method();
		
	}

}

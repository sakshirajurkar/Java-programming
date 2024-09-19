package package1;

public class Constructor {

	Constructor()
	{
		int a = 3;
		int b = 3;
		System.out.println(a+b);
	}
	Constructor(int a, int b)
	{
		int num1 = a;
		int num2 = b;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Constructor ob = new Constructor(); 
		Constructor ob1 = new Constructor(4,7); 
		
	}
}

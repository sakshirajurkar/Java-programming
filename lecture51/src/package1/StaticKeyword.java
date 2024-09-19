package package1;

public class StaticKeyword {
	static int num;
	static void show()
	{
		System.out.println("Hello");
	}
	 
	public static void main(String[] args) {
		show();
		num = 324;
		System.out.println(num);
	}
    
}

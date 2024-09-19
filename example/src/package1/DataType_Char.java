package package1;

public class DataType_Char {
	char a = 'j';
	char b = 'A';
	char c = 'V';
	char d = 'A';
	void join ()
	{
		System.out.println("The Char value is: "+a+b+c+d);
	}

	public static void main(String[] args) {
		DataType_Char ob = new DataType_Char ();
		ob.join();
	}

}

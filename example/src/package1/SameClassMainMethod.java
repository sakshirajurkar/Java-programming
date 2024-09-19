package package1;

public class SameClassMainMethod {
	int a = 15000;
	int b = 20000;
	
	void add () {
		int c = a+b;
		System.out.println("The int value is: "+c);
	}

	public static void main(String[] args) {
		SameClassMainMethod ob = new SameClassMainMethod();
		ob.add();
	}

}

package package1;

public class BooleanVariable {
	boolean a = true;
	void check() {
		if (a == true) {
			a = false;
			System.out.println("The boolean value is: "+a);
		}
	}

	public static void main(String[] args) {
		BooleanVariable ob = new BooleanVariable();
		ob.check();
		System.out.println(ob.a);
	}

}

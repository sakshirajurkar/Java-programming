package lecture32;

public class MethodChaining {
	 int id;
	 String name;
	void m1 ()
	{
		this.m1("Ankita");
		id = 87;
		name = "sakshi";
		System.out.println("0-args parameterized");
	}
	void m1 (String n)
	{
		System.out.println("1-args parameterized");
	}

	public static void main(String[] args) {
		MethodChaining ob = new MethodChaining();
		ob.m1();
	}

}

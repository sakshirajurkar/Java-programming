package lecture32;

public class MethodChaining3 {
	int a;
	void m1()
	{
		this.m1(5);
		a = 0;
		System.out.println("0-arga parameter");
	}
	void m1(int a)
	{
		this.m1(76,98);
		System.out.println("1-arga parameter");
	}
	void m1 (int a,int b)
	{
		this.m1(77,54,87);
		System.out.println("2-arga parameter");
	}
	void m1 (int a,int b,int c)
	{
		System.out.println("3-arga parameter");
	}

	public static void main(String[] args) {
		MethodChaining3 ob = new MethodChaining3();
		ob.m1();
		
	}

}

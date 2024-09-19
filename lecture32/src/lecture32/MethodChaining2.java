package lecture32;

public class MethodChaining2{
	
	void m1()
	{
		this.m1(12);
		System.out.println("0-paramiterized method");
	}
	void m1(int x)
	{
		this.m1(34,98);
		System.out.println("1-paramiterized contrustor");
	}
	void m1(int x, int y)
	{
		this.m1(87,9,92);
		System.out.println("2-paramiterized contrustor");

	}
	void m1(int x, int y, int z)
	{
		this.m1(7,8,2,5);
		System.out.println("3-paramiterized contrustor");

	}
	void m1(int x, int y, int z, int i)
	{
		System.out.println("4-paramiterized contrustor");

	}

	public static void main(String[] args) {
		MethodChaining2 ob1 = new MethodChaining2();
		ob1.m1();
		
	}
}

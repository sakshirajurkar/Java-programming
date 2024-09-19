package abstraction;

interface I1 {
	void m1();

	void m2();
}
public class MyClass implements I1 {
    @Override
	public void m1() {
		System.out.println("hello from m1");
	}
    @Override
	public void m2() {
		System.out.println("hello from m2");
	}
    public static void main(String[] args) {
		MyClass ob = new MyClass();
		ob.m1();
		ob.m2();
	}

}

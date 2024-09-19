package package1;
class MethodOverriding1{
	void m1 () {
		System.out.println("Hello from first class");
	}
}
class MethodOverriding2 extends MethodOverriding1{
	void m1() {
		System.out.println("Hello from second class ");
	}
}
public class MethodOverriding4 {

	public static void main(String[] args) {
		MethodOverriding2 ob = new MethodOverriding2();
		ob.m1();
	}

}

package package1;
class SingleI{
	void m1() {
		System.out.println("Hello from Parent class");
	}
}
class SingleII extends SingleI{
	void m2() {
		System.out.println("Hello from child class");
	}
}
public class SingleInheritance2 {

	public static void main(String[] args) {
		SingleII ob= new SingleII();
		ob.m1();
		ob.m2();
	}

}

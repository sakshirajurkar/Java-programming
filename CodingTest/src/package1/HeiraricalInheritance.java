package package1;
class heirachy{
	void m1 () {
		System.out.println("Hello from parent class");
	}
}
class heirachy2 extends heirachy{
	void m2() {
		System.out.println("Hello from first child class");
	}
}
class heirachy3 extends heirachy{
	void m3() {
		System.out.println("Hello from second child class");
	}
}
public class HeiraricalInheritance {

	public static void main(String[] args) {
		heirachy2 ob1 = new heirachy2();
		ob1.m1();
		ob1.m2();
		
		heirachy3 ob2 = new heirachy3();
		ob2.m1();
		ob2.m3();
				
	}
}

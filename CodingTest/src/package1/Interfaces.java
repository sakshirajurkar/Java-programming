package package1;

interface I1 {
	void m1();
}

interface I2 {
	void m2();
}

public class Interfaces implements I1, I2 {

	public void m1() {
		System.out.println("Interface-1");
	}

	public void m2() {
		System.out.println("Interface-2");
	}

	public static void main(String[] args) {
		Interfaces ob = new Interfaces();
		ob.m1();
		ob.m2();
	}

}

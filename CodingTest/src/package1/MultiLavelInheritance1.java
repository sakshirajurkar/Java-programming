package package1;
class multilavel{
	void m1() {
		System.out.println("Hello from grand parent class");
	}
}
class multilavel2 extends multilavel{
	void m2() {
		System.out.println("Hello from parent class");
	}
}
class multilavel3 extends multilavel2{
	void m3(){
		System.out.println("Hello from child class");
	}
}
public class MultiLavelInheritance1 {

	public static void main(String[] args) {
		multilavel3 ob = new multilavel3 ();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

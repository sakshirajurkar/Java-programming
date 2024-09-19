package package1;
class A1 {
	public void methoodA() {
		System.out.println("method of class A");
	}
}
class B1 extends A1{
	public void methodB ()
	{
		System.out.println("method of class B");
	}
}
class C extends A1{
	public void methodC()
	{
		System.out.println("method of class C");
	}
}
class D extends A1 {
	public void methodD () {
		System.out.println("method of class D");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		B1 ob = new B1 ();
		ob.methoodA();
		ob.methodB();
		
		C ob1 = new C ();
		ob1.methoodA();
		ob1.methodC();
		
		D ob2 = new D ();
		ob2.methoodA();
		ob2.methodD();
		
	}

}

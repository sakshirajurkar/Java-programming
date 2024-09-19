package Inheritance;

class S {
	void m1() {
		System.out.println("Calling m1 from class S");
	}
}

class SS extends S {
	void m2() {
		System.out.println("Calling m2 from class SS");
	}
}

class SSS extends SS {
	void m3() {
		System.out.println("Calling m3 from class SSS");
	}
}

public class HierarichalInheritance2 {

	public static void main(String[] args) {
         SSS ob = new SSS ();
         ob.m1();
         ob.m2();
         ob.m3();
	}

}

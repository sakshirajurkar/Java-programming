package package1;
class Baseclass {
	public void method() {
		System.out.println("This is the method of Base Class");
	}
}
class DerivedClass extends Baseclass{
	public void method()
	{
		System.out.println("This is the method of Derived Class");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		DerivedClass ob = new DerivedClass ();
		ob.method();
		
		
     }

}

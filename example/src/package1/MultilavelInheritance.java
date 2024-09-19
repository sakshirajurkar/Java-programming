package package1;
class Car {
	public Car() {
		System.out.println("Constructor of Class Car");
	}
	public void vehicalType() {
		System.out.println("Vehical Type:Car");
	}
}
class Maruti extends Car{
	public Maruti ()
	{
		System.out.println("Constructor of class Maruti ");
	}
	public void brand () {
		System.out.println("Brand:Maruti");
	}
	public void speed () {
		System.out.println("Max speed: 90kmph");
	}
}

public class MultilavelInheritance extends Maruti {
	public MultilavelInheritance () {
		System.out.println("Constructor of class Maruti800");
	}
	public void speed () {
		System.out.println("Max speed: 80kmph");
	}

	public static void main(String[] args) {
		MultilavelInheritance ob = new MultilavelInheritance();
		ob.vehicalType();
		ob.brand();
		ob.speed();
	}
}

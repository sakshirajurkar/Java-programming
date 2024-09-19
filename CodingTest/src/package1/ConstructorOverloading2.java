package package1;
class constructorOverriding1{
	constructorOverriding1 (){
		System.out.println("First constructor");
	}
}
class constructorOverriding2 extends constructorOverriding1{
	constructorOverriding2(){
		System.out.println("Second constructor");
	}
}
public class ConstructorOverloading2 {

	public static void main(String[] args) {
		constructorOverriding2 ob2 = new constructorOverriding2();
	}

}

package OOPS;
abstract class A8 {
	abstract void m1();
		
}
public class Abstraction extends A8 {
    public void m1() {
    	System.out.println("abstract class");
    }
	public static void main(String[] args) {
		Abstraction ob =new Abstraction();
		ob.m1();
	}
}

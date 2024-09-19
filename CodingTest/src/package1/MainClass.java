package package1;
abstract class myClass{
	abstract void m1();
	abstract void m2();
	void m3() {
		System.out.println("Hello world");
	}
}
public class MainClass extends myClass{
       void m1() {
    	   System.out.println("abstract class 1");
       }
       void m2() {
    	   System.out.println("abstract class-2");
       }
	public static void main(String[] args) {
		MainClass ob = new MainClass();
		ob.m1();
		ob.m2();
		ob.m3();
	}

}

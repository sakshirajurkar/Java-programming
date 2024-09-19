package multithreading;

public class ThreadDemo_5 {

	public static void main(String[] args) {
		MainClass_5 ob = new MainClass_5();
		ob.start();
		
		MainClass_5 ob1 = new MainClass_5();
		ob1.start();
		
		MainClass_5 ob2 = new MainClass_5();
		ob2.start();
		
		System.out.println(Thread.currentThread().getName() +"Says: Hii");
	}
	

}

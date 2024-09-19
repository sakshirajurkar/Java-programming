package multithreading;

public class ThreadDemo_6 {

	public static void main(String[] args) {
		MainClass_6 ob = new MainClass_6();
		Thread t1 = new Thread(ob);
		t1.start();
		
		MainClass_6 ob1 = new MainClass_6();
		Thread t2 = new Thread(ob1);
		t2.start();
		
		MainClass_6 ob2 = new MainClass_6();
		Thread t3 = new Thread (ob2);
		t3.start();
		
		System.out.println(Thread.currentThread().getName()+"Says:Hello Giants");
	}
}

package multithreading;

public class InterfaceRunnable {

	public static void main(String[] args) {
		InterafceMainClass ob = new InterafceMainClass();
		Thread t1 = new Thread(ob);
		t1.start();
		System.out.println(t1);
		
		InterafceMainClass ob1 = new InterafceMainClass();
		Thread t2 = new Thread(ob1);
		t2.start();
		System.out.println(t2);
		
		System.out.println(Thread.currentThread().getName()+"Goofy");
		
	}

}

package multithreading;

public class MainClass_4  extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Says: Hello Everyone");
	}

}

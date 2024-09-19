package multithreading;

public class ThreadDemo7 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName()+"Hey! How are you?");
		}
	}

}

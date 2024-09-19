package multithreading;

public class MainClass_6 implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName()+"Says: Alexa play Come Down");
		}
	}
	
}

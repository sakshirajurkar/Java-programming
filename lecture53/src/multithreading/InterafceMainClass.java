package multithreading;

public class InterafceMainClass implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName()+"Hey goofy");
		}
		
	}

}

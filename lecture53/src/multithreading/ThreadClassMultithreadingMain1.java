package multithreading;

public class ThreadClassMultithreadingMain1 extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName()+ "Hii");
		}
	}

}

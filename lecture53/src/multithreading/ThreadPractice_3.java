package multithreading;

public class ThreadPractice_3 {

	public static void main(String[] args) {
		MainClass_3 ob = new MainClass_3();
		Thread t1 = new Thread (ob);
		t1.start();
		
		for (int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

}

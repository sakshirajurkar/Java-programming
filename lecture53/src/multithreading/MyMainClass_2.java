package multithreading;

public class MyMainClass_2 {

	public static void main(String[] args) {
		DemoThread_2 ob =  new DemoThread_2();
		ob.start();
		
		DemoThread_2 ob1 =  new DemoThread_2();
		ob1.start();
		
		DemoThread_2 ob2 =  new DemoThread_2();
		ob2.start();
		
		for (int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

}

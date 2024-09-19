package multithreading;

public class InterfaceMultithreading1 {

	public static void main(String[] args) {
		InterfaceMultitreadingMain1  ob = new InterfaceMultitreadingMain1 ();
		Thread t1 = new Thread(ob);
		t1.start();
		
		InterfaceMultitreadingMain1  ob1 =  new InterfaceMultitreadingMain1 ();
		Thread t2 = new Thread (ob1);
		t2.start();
		
		InterfaceMultitreadingMain1  ob2 = new InterfaceMultitreadingMain1 ();
		Thread t3 = new Thread (ob2);
		t3.start();
		
		System.out.println(Thread.currentThread().getName()+ "Hii");
	}

}

package multithreading;

public class MainClass_1 {

	public static void main(String[] args) {
		ThreadDemo_1 ob = new ThreadDemo_1();
		ob.start();
		
		ThreadDemo_1 ob1 = new ThreadDemo_1();
		ob1.start();
	}
	

}

package multithreading;

public class MainClass {
      public static void main(String[] args) {
		ThreadDemo7 ob= new ThreadDemo7();
		ob.start();
		
		ThreadDemo7 ob2 = new ThreadDemo7();
		ob2.start();
	}

}

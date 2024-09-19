package multithreading;

public class ThreadClassMultithreading1 {

      public static void main(String[] args) {
    	  ThreadClassMultithreadingMain1 ob = new ThreadClassMultithreadingMain1();
    	  ob.start();
    	  
    	  ThreadClassMultithreadingMain1 ob1 = new ThreadClassMultithreadingMain1();
    	  ob1.start();
    	  
    	  ThreadClassMultithreadingMain1 ob2 = new ThreadClassMultithreadingMain1();
    	  ob2.start();
    	  
    	  System.out.println(Thread.currentThread().getName() + "Hello");
    	  
    	  
      }

}

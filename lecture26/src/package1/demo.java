package package1;

public class demo {
      void EvenOdd (int num)
      {
    	  if (num % 2 ==0)
    	  {
    		  System.out.println("num is even");
    	  }
    	  else 
    	  {
    		  System.out.println("num is odd");
    	  }
      }
      
      
	public static void main(String[] args)
	{
		
		demo ob = new demo();
		ob.EvenOdd(6);
		
	}
}

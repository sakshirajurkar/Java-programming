package package1;

public class demo1 {
	   int lessNum()
	   {
		   int x =  6;
		   int y = 2;
		   
		   if(x<y)
		   {
			   return x;
		   }
		   else 
		   {
			   return y;
		   }
	   }
	   void displayResult()
	   {
		   int p = lessNum();
		   System.out.println(p+" is less num ");
	   }

	public static void main(String[] args) {
		demo1 ob = new demo1();
		ob. displayResult();
		
	}

}

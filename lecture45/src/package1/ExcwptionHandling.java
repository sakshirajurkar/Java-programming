package package1;
   class DivideByZeroException extends Throwable {
	   DivideByZeroException (String msg){
		   super (msg);
	   }
   }
   class MyArithmaticException {
	   void divison (int divident, int devisor) throws DivideByZeroException {
		   if(devisor == 0) {
			   
		   throw new DivideByZeroException ("/by zero");
		   }
		   System.out.println(devisor/divident);
	   }
   }




public class ExcwptionHandling {

	public static void main(String[] args) {
		MyArithmaticException  ob = new MyArithmaticException ();
		int num1 = 24;
		int num2 = 0;
		try
		{
			ob.divison(num1,num2);
		}
		catch (DivideByZeroException e) {
			System.out.println("Divisor should not be zero"+e.getMessage());
		}
	}
}

package package1;

class MyArithmaticExcception ()
{
	
}
void division (int divident, int devisor) throws DivideByZeroException{
	if (devisor == 0 )
	{
		throw new DivideByZeroException();
	}
	System.out.println(divident/divisor);
}
public class ExceptionHandling {
	
	public static void main(String[] args) {
		 ExceptionHandling  ob = new  ExceptionHandling();
		 int num1 = 34;
		 int num2  =0;
		 try 
		 {
			 ob.division(num1, num2);
;		 }
		 catch (DivideByZeroException e)
		 {
			 System.out.println("Exception in thread main divi by zero exception:"+e.getMessage());
		 }
	}

}

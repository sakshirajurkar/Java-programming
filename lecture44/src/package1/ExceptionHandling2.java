package package1;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try 
		{
			int num1 = 23;
			int num2 = 0;
			System.out.println(num1/num2);
			try
			{
				System.out.println(23/0);
			}
			catch (ArithmeticException ae)
			{
				System.out.println("inner  catch block 1");
			}
			try 
			{
				int a[] = {1,2,3,4,5};
				System.out.println(8);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("inner catch block 2");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("infinite");
		}
		
	}

}

package package1;

public class ExceptionHandling {

	public static void main(String[] args) {
		try 
		{
			String name = null;
			System.out.println(name.length());
			try 
			{
				System.out.println(2/0);
				try 
				{
					int a[] = {1,23,43,45,23};
					System.out.println(9);
				}
				catch (ArrayIndexOutOfBoundsException ae)
				{
					System.out.println("Innner catch block "+ ae.getMessage());
				}
			}
			catch (ArithmeticException ae)
			{
				System.out.println("Middle catch block "+ ae.getMessage());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("outer catch block"+ e.getMessage());
		}
	}

}

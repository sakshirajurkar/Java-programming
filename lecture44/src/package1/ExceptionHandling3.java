package package1;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		try 
		{
			String name = null;
			System.out.println(name.length());
			try 
			{
				int a[] = {1,2,3,4,5,6,7,8,9};
				System.out.println(10);
				
				try 
				{
					System.out.println(a[2]/0);
				}
				catch (ArithmeticException ae)
				{
					System.out.println(ae.getMessage());
				}
			}
			catch (ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(ae.getMessage());
			}
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

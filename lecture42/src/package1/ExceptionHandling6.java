package package1;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		try
		{
			System.out.println(a[2]);
			System.out.println(a[1]/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Infinite");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Enter index less than array length");
		}
		
		
	}

}

package package1;

public class ExceptionHandling7 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		try
		{
			System.out.println(a[2]);
			System.out.println(a[2]/0);
			System.out.println(a[54]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Infinite");
		}
			
		
	}

}

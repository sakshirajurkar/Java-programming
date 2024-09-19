package package1;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a[] = {12,23,34,56};
		try
		{
		System.out.println(a[23]);
		System.out.println(a[1]/0);
		System.out.println(a[9]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("infinite");
		}
				
		
		
	}

}

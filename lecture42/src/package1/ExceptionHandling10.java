package package1;

public class ExceptionHandling10 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		try
		{
		System.out.println(a[0]);
		System.out.println(a[2]/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("infinite");
		}
	}

}

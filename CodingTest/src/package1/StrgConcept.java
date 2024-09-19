package package1;

public class StrgConcept {

	public static void main(String[] args) {
		int a[] = {12,34,5,3,7};
		
		try
		{
		System.out.println(a[34]);
		System.out.println(a[2]/0);
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("exception 1");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("infinite");
		}
	}

}

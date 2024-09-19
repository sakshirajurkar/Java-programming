package package1;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int num1 = 12;
			int num2 = 0;
			System.out.println(num1 /num2);
			
			try {
				System.out.println(23/0);
			}
			catch(ArithmeticException e) 
			{
				System.out.println("inner block - 2 Arithmetic Exception ");
			}
			try {
				int a[] = {1,2,3,4,5};
				System.out.println(8);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("inner block - 2 enter the element present in array");
			}
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("outer catch block infinite");
		}
	}

}

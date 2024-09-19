package package1;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
			try {
				int a[] = { 1, 2, 3, 4, 5 };
				System.out.println(9);

				try {
					System.out.println(a[2] / 0);
				} catch (ArithmeticException ae) {
					System.out.println("inner catch block" + ae.getMessage());
				}
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("middle catch block" + ae.getMessage());
			}
		} catch (NullPointerException e) {
			System.out.println("outer catch block" + e.getMessage());
		}

	}

}

package package1;

class DivideByZeroException extends Throwable {
	DivideByZeroException(String msg) {
		super(msg);
	}
}

class MyException {
	void exception(int divisor, int devident) throws DivideByZeroException {
		if (divisor == 0) {
			throw new DivideByZeroException("/ by zero ");
		}

		System.out.println(divisor / devident);

	}

}

public class CostomisedException {

	public static void main(String[] args) {
		MyException ob = new MyException();
		int num1 = 24;
		int num2 = 0;
		try {
			ob.exception(num1, num2);
		} catch (DivideByZeroException e) {
			System.out.println("Exception in thread" + e.getMessage());
		}
	}

}

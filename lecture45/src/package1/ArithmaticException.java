package package1;

public class ArithmaticException {

	void division(int divident, int devisor)
	{
		int result = divident/devisor;
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		 ArithmaticException ob = new  ArithmaticException();
		 ob.division(24,3);
	}

}

package package1;

public class MultiplicationByMethod {
	void multiply()
	{
		int p = 23;
		int q = 9;
		int result = p*q;
		System.out.println(result); 
	}

	public static void main(String[] args) {
		MultiplicationByMethod t2 = new MultiplicationByMethod ();
		t2.multiply ();
	}
}

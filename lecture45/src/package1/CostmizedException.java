package package1;

class InvalidAgeException extends Throwable {
	InvalidAgeException(String m) {
		super(m);
	}
}

class Limit {
	void Rigister(int age) throws InvalidAgeException {
		if (age > 18) {
			throw new InvalidAgeException("user is a minor");
		}
		else
		{
			System.out.println("Rigister successfully");
		}
	}
}

public class CostmizedException {

	public static void main(String[] args) {
		Limit ob = new Limit();
		try {
			ob.Rigister(19);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}

package package1;
class InvalidAgeException extends Throwable{
	InvalidAgeException (String msg){
		super (msg);
	}
}

class limitation {
	void rigister (int age )throws InvalidAgeException
	{
		if (age > 18 ) {
			throw new InvalidAgeException ("user is a minor");
		}
		else
		{
			System.out.println("Successfully rigister");
		}
	}
}

public class Rigistration3 {

	public static void main(String[] args) {
		limitation  ob = new limitation ();
		try {
			ob.rigister(2);
		}
		catch (InvalidAgeException  e) {
			System.out.println(e.getMessage());
		}
		
	}

}

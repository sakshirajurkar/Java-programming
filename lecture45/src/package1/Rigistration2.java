package package1;
class InvalidAgeLimit extends Throwable {
	InvalidAgeLimit (String msg){
		super (msg);
	}
}
class AgeLimit {
	void rigister (int age) throws InvalidAgeLimit  {
		if (age > 18) {
			throw new InvalidAgeLimit ("valid age");
		}
		else
		{
			System.out.println("Successfully Rigister");
		}
	}
}

public class Rigistration2 {

	public static void main(String[] args) {
		 AgeLimit ob = new  AgeLimit ();
		 try 
		 {
			 ob.rigister(20);
		 }
		 catch (InvalidAgeLimit e)
		 {
			 System.out.println(e.getMessage());
		 }
		
	}

}

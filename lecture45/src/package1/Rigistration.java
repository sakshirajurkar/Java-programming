package package1;

   class InvalidAgeException extends Throwable {
	   public  InvalidAgeException (String m) {
		   super(m);
	   }
   }
    class MyRegistration{
	  void rigister (int age) throws InvalidAgeException{
		  if (age < 18) {
			  throw new InvalidAgeException ("user is a minor");
		  }
		  else
		  {
			  System.out.println("Successfully register");
		  }
	  }
     }
public class Rigistration {

	public static void main(String[] args) {
		MyRegistration ob = new MyRegistration();
		try 
		{
			ob.rigister(10);
		}
		catch (InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

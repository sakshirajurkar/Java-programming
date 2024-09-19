package package1;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Vaibhav";
		String rev = "";
		
		for (int i=0; i<name.length(); i++)
		
		{
			rev = name.charAt(i)+rev;
			
		}
		System.out.println("reverse string  "+rev);
	}

}

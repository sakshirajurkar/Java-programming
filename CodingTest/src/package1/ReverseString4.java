package package1;

public class ReverseString4 {

	public static void main(String[] args) {
		String name = "Shiva";
		String rev = "";
		
		for (int i=0; i<name.length(); i++)
		{
			rev = name.charAt(i)+rev;
		}
		System.out.println("reverse string "+ rev);
	}

}

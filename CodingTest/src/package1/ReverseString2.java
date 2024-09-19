package package1;

public class ReverseString2 {

	public static void main(String[] args) {
		String name = "Vedant";
		String rev = "";
		
		for (int i=0; i<name.length(); i++) {
			rev = name.charAt(i)+rev;
		}
		System.out.println("reverse of string: "+rev);
	}

}
